package Services;

import Models.Goal;
import Models.Reminder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ReminderService {

    ArrayList<Reminder> reminders = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public ReminderService() {}

    public Reminder createReminder() {
        System.out.println("Por favor ingresa el id del recordatorio");
        Integer reminderId  = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor ingresa el titulo del recordatorio");
        String reminderTittle = sc.nextLine();

        System.out.println("Por favor ingresa la fecha del recordatorio");
        String dateString = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime reminderDate = LocalDateTime.parse(dateString, formatter);

        Reminder newReminder = new Reminder(reminderId, reminderTittle, reminderDate);
        reminders.add(newReminder);
        return newReminder;
    }

    public void editReminder() {
        System.out.println("Ingresa el id del reminder que quieres editar");
        Integer inputId = sc.nextInt();
        sc.nextLine();

        for (Reminder reminder : reminders) {
            Integer reminderId = reminder.getReminderId();
            String reminderTittle, reminderDateString;
            if (reminderId == inputId) {
                System.out.println("Se editaran todos los campos");
                System.out.println("Ingresa el titulo del recordatorio");
                reminderTittle = sc.nextLine();
                reminder.setReminderTittle(reminderTittle);
                System.out.println("Ingresa la fecha del recordatorio");
                reminderDateString = sc.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                LocalDateTime reminderDate = LocalDateTime.parse(reminderDateString, formatter);
                reminder.setReminderDate(reminderDate);
            }
        }
    }

    public void deleteReminder() {
        System.out.println("Por favor ingresa el id del recordatorio que se eliminara");
        Integer inputId = sc.nextInt();
        sc.nextLine();
        Iterator<Reminder> iterator = reminders.iterator();
        while (iterator.hasNext()) {
            Reminder reminder = iterator.next();
            if (reminder.getReminderId().equals(inputId)) {
                iterator.remove();
                System.out.println("Recordatorio eliminado correctamente.");
                return;
            }
        }
        System.out.println("Recordatorio no encontrado.");
    }
}
