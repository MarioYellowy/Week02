package Services;

import Models.ObjectiveSteps;

import java.util.ArrayList;
import java.util.Scanner;

public class
ObjectiveStepsService {
    ArrayList<ObjectiveSteps> objectivesSteps = new ArrayList<>();

    public ObjectiveStepsService() {}

    Scanner sc = new Scanner(System.in);

    public ObjectiveSteps createObjectiveStep() {
        System.out.println("Por favor ingresa la meta a la que se le asignaran los pasos");
        Integer goalId = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor ingresa la descripcion de la meta");
        String objectiveDescription = sc.nextLine();
        System.out.println("Ingresa la cantidad de pasos");
        Integer stepCount = sc.nextInt();
        sc.nextLine();
        String stepsToTake[] = new String[stepCount];
        for (int i = 0; i < stepCount; i++) {
            System.out.println("Ingresa el paso:");
            String step = sc.nextLine();
            stepsToTake[i] = step;
        }
        System.out.println("Pasos agregados con exito");
        String stepsTaken[] = new String[stepCount];
        ObjectiveSteps newObjectiveSteps = new ObjectiveSteps(objectiveDescription,stepsToTake, stepsTaken, goalId);
        System.out.println("Los pasos de la meta se crearon exitosamente");
        objectivesSteps.add(newObjectiveSteps);
        return newObjectiveSteps;
    }

    public void editSteps() {
        System.out.println("Por favor ingresa el id de los pasos que quieres editar:");
        Integer inputId = sc.nextInt();
        for (ObjectiveSteps step : objectivesSteps) {
            Integer goalId = step.getGoalId();
            String goalStep;
            Integer stepsCount;
            if (goalId == inputId) {
                System.out.println("Se actualizaran todos los pasos");
                System.out.println("Por favor ingresa la cantidad de pasos");
                stepsCount = sc.nextInt();
                sc.nextLine();
                String stepsToTake[] = new String[stepsCount];
                for (int i = 0; i < stepsCount; i++) {
                    System.out.println("Ingresa el paso:");
                    goalStep = sc.nextLine();
                    stepsToTake[i] = goalStep;
                }
            } else {
                System.out.println("Los objetivos con id: " + goalId + " no existen");
            }
        }
    }

    public void deleteStepsByGoal() {
        System.out.println("Por favor ingresa el ID de la meta que se eliminarán los pasos: ");
        Integer inputId = sc.nextInt();
        for (ObjectiveSteps stepList : objectivesSteps) {
            Integer goalId = stepList.getGoalId();
            if (goalId == inputId) {
                System.out.println("Estos son los pasos dentro de la meta:");
                String[] steps = stepList.getObjectiveStepsToTake();
                for(int i = 1; i <= steps.length; i++) {
                    System.out.println(i + ".- " + steps[i-1]);
                }
                System.out.println("Por favor ingresa el numero del paso que quieres eliminar");
                Integer stepNumber = sc.nextInt();
                for(int j = 0; j < steps.length; j++) {
                    if ((stepNumber-1) == j) {
                        steps[j] = "";
                    }
                }
            }
        }
    }

    public void getStepsByGoal() {
        System.out.println("Por favor ingresa el Id de la meta");
        Integer inputId = sc.nextInt();
        for (ObjectiveSteps stepList : objectivesSteps) {
            Integer goalId = stepList.getGoalId();
            if (goalId == inputId) {
                String[] steps = stepList.getObjectiveStepsToTake();
                for(int i = 1; i <= steps.length; i++) {
                    System.out.println(i + ".- " + steps[i-1]);
                }
            }
        }
    }
}
