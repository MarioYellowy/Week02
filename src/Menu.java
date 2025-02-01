import Services.*;

import java.util.Scanner;

public class Menu {
    Menu() {
        Boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        UserService userService = new UserService();
        GoalService goalService = new GoalService();
        ObjectiveStepsService objectiveStepsService = new ObjectiveStepsService();
        ExerciseService exerciseService = new ExerciseService();
        ReminderService reminderService = new ReminderService();
        TrainingPlanService trainingPlanService = new TrainingPlanService();
        WorkoutSessionService workoutSessionService = new WorkoutSessionService();

        while (loop) {
            System.out.println("-- Welcome, select a option: --\n\t1.- Crear nuevo usuario\n\t2.- Editar usuario\n\t3.- Eliminar usuario" +
                "\n\t4.- Crear meta\n\t5.- Editar meta\n\t6.- Eliminar meta\n\t7.- Crear nuevos pasos para el objetivo" +
                "\n\t8.- Eliminar paso para el objetivo\n\t9.- Agregar ejercicio\n\t10.- Editar ejercicio\n\t11.- Eliminar ejercicio" +
                "\n\t12.- Crear recordatorio\n\t13.- Editar recordatorio\n\t14.- Eliminar recordatorio\n\t15.- Crear plan de entrenamiento" +
                "\n\t16.- Editar plan de entrenamiento\n\t17.- Eliminar plan de entrenamiento\n\t18.- Crear sesion de ejercicio" +
                "\n\t19.- Editar la sesion de ejercicio\n\t20.- Eliminar la sesion de ejercicio\n\t21.- Mostrar a todos los usuarios" +
                    "\n\t22.- Mostrar todas las metas" + "\n\t23.- Obtener los pasos de una meta" +
                    "\n\t24.- Exit");
            Integer input = scanner.nextInt();
            switch (input) {
                case 1:
                    userService.createUser();
                    break;
                case 2:
                    userService.editUser();
                    break;
                case 3:
                    userService.deleteUser();
                    break;
                case 4:
                    goalService.createGoal();
                    break;
                case 5:
                    goalService.editGoal();
                    break;
                case 6:
                    goalService.deleteGoal();
                    break;
                case 7:
                    objectiveStepsService.createObjectiveStep();
                    break;
                case 8:
                    objectiveStepsService.deleteStepsByGoal();
                    break;
                case 9:
                    exerciseService.createExercise();
                    break;
                case 10:
                    exerciseService.editExercise();
                    break;
                case 11:
                    exerciseService.deleteExercise();
                    break;
                case 12:
                    reminderService.createReminder();
                    break;
                case 13:
                    reminderService.editReminder();
                    break;
                case 14:
                    reminderService.deleteReminder();
                    break;
                case 15:
                    trainingPlanService.createPlan();
                    break;
                case 16:
                    trainingPlanService.editPlan();
                    break;
                case 17:
                    trainingPlanService.deletePlan();
                    break;
                case 18:
                    workoutSessionService.createWorkoutSession();
                    break;
                case 19:
                    workoutSessionService.editWorkoutSession();
                    break;
                case 20:
                    workoutSessionService.deleteWorkoutSession();
                    break;
                case 21:
                    userService.getUsers();
                    break;
                case 22:
                    goalService.getGoals();
                    break;
                case 23:
                    objectiveStepsService.getStepsByGoal();
                    break;
                case 24:
                    loop = false;
                    break;
            }
        }
    }
}
