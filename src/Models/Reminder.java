package Models;

import java.time.LocalDateTime;

public class Reminder {

    private Integer reminderId, userId;
    private String reminderTittle;
    private LocalDateTime reminderDate;

    public Reminder(Integer reminderId, String reminderTittle, LocalDateTime reminderDate) {
        this.reminderId = reminderId;
        this.reminderTittle = reminderTittle;
        this.reminderDate = reminderDate;
    }

    public Integer getReminderId() {
        return reminderId;
    }

    public String getReminderTittle() {
        return reminderTittle;
    }

    public void setReminderTittle(String reminderTittle) {
        this.reminderTittle = reminderTittle;
    }

    public LocalDateTime getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(LocalDateTime reminderDate) {
        this.reminderDate = reminderDate;
    }
}
