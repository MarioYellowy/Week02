package Services;

import Models.WorkoutSession;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkoutSessionService {
    ArrayList<WorkoutSession> workoutSessions = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public WorkoutSessionService() {}

    public WorkoutSession createWorkoutSession() {
        System.out.println("Por favor ingresa el id de la nueva sesion de ejercicio");
        Integer inputId = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor ingresa ");
    }
}
