package Services;

import Enums.ETrainingPlanType;
import Models.Goal;
import Models.TrainingPlan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TrainingPlanService {

    ArrayList<TrainingPlan> trainingPlans = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public TrainingPlanService() {}

    public TrainingPlan createPlan() {
        System.out.println("Por favor ingresa el id del plan de entrenamiento");
        Integer inputId = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor ingresa el nombre del plan de entrenamiento");
        String planName = sc.nextLine();

        System.out.println("Por favor ingresa el tipo de entramiento, toma en cuenta que solamente puedes poner las siguientes opciones:\n Full body,\n" +
                "    Lower body,\n" +
                "    Upper body,\n" +
                "    Legs,\n" +
                "    Arms");

        ETrainingPlanType type = ETrainingPlanType.fromString(sc.nextLine());
        TrainingPlan newTrainingPlan = new TrainingPlan(inputId, planName, type);
        System.out.println("Plan de entrenamiento creado");
        trainingPlans.add(newTrainingPlan);
        return newTrainingPlan;
    }

    public void editPlan() {
        System.out.println("Por favor ingresa el plan que quieres editar");
        Integer inputId = sc.nextInt();
        sc.nextLine();
        for (TrainingPlan plan : trainingPlans) {
            Integer planId = plan.getTrainingPlanId();
            if (planId == inputId) {
                System.out.println("Se modificaran todos los campos");
                System.out.println("Por favor ingresa el nombre del plan");
                String planName = sc.nextLine();
                plan.setTrainingPlanName(planName);
                System.out.println("Por favor ingresa el tipo de plan");
                ETrainingPlanType type = ETrainingPlanType.fromString(sc.nextLine());
                plan.setTrainingPlanType(type);
            }
            System.out.println("EL entrenamiento con id: " + inputId + " no existe");
        }
    }

    public void deletePlan() {
        System.out.println("Por favor ingresa el ID de la meta que se eliminará: ");
        Integer inputId = sc.nextInt();
        Iterator<TrainingPlan> iterator = trainingPlans.iterator();
        while (iterator.hasNext()) {
            TrainingPlan plan = iterator.next();
            if (plan.getTrainingPlanId().equals(inputId)) {
                iterator.remove();
                System.out.println("Plan de entrenamiento eliminado correctamente.");
                return;
            }
        }
        System.out.println("Plan de entrenamiento no encontrado.");
    }
}
