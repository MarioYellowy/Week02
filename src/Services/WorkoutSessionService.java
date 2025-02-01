package Services;

import Models.User;
import Models.WorkoutSession;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class WorkoutSessionService {
    ArrayList<WorkoutSession> workoutSessions = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public WorkoutSessionService() {}

    public WorkoutSession createWorkoutSession() {
        System.out.println("Por favor ingresa el id de la nueva sesion de ejercicio");
        Integer inputId = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor ingresa el tiempo que durara la sesion");
        float sessionTime = sc.nextFloat();

        System.out.println("Sesion de ejercicio creada");
        WorkoutSession newWorkoutSession = new WorkoutSession(inputId, sessionTime);
        workoutSessions.add(newWorkoutSession);
        return newWorkoutSession;
    }

    public void editWorkoutSession() {
        System.out.println("Por favor ingresa el id de la sesion de ejercicio a modificar");
        Integer inputId =  sc.nextInt();
        sc.nextLine();
        for (WorkoutSession session : workoutSessions) {
            Integer sessionId = session.getWorkoutSessionId();
            if (inputId == sessionId) {
                System.out.println("Se reestableceran los datos de la sesion");
                System.out.println("Por favor ingresa el tiempo de la sesion");
                float sessionTime = sc.nextFloat();
                session.setWorkoutSessionTime(sessionTime);
            }
            System.out.println("La sesion de ejercicio con id: " + inputId + " no existe");
        }
    }

    public void deleteWorkoutSession() {
        System.out.println("Por favor ingresa el id de la sesion de ejercicio");
        Integer inputId = sc.nextInt();
        Iterator<WorkoutSession> iterator = workoutSessions.iterator();
        while (iterator.hasNext()) {
            WorkoutSession session = iterator.next();
            if (session.getWorkoutSessionId().equals(inputId)) {
                iterator.remove();
                System.out.println("La sesion de ejercicio fue eliminado correctamente.");
                return;
            }
        }
        System.out.println("Sesion de ejercicio no encontrado.");
    }
}
