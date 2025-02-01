package Services;

import Models.Goal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GoalService {

    ArrayList<Goal> goals = new ArrayList<>();

    public GoalService() {}

    Scanner sc = new Scanner(System.in);

    public Goal createGoal() {
        System.out.println("Por favor ingresa el id de la meta");
        Integer goalId = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor ingresa el titulo de la meta");
        String goalTittle = sc.nextLine();

        Goal newGoal = new Goal(goalId, goalTittle);
        System.out.println("La meta se creo con exito: " + newGoal.toString());
        goals.add(newGoal);
        return newGoal;
    }

    public void editGoal() {
        System.out.println("Por favor ingresa el id de la meta que quieres editar:");
        Integer inputId = sc.nextInt();
        for (Goal goal : goals) {
            Integer goalId = goal.getGoalId();
            String goalTittle;
            if (goalId == inputId) {
                System.out.println("Se actualizaran todos los datos");
                System.out.println("Por favor ingresa el titulo");
                goalTittle = sc.nextLine();
                goal.setGoalTittle(goalTittle);
            } else {
                System.out.println("La meta con id: " + goalId + " no existe");
            }
        }
    }

    public void deleteGoal() {
        System.out.println("Por favor ingresa el ID de la meta que se eliminará: ");
        Integer inputId = sc.nextInt();
        Iterator<Goal> iterator = goals.iterator();
        while (iterator.hasNext()) {
            Goal goal = iterator.next();
            if (goal.getGoalId().equals(inputId)) {
                iterator.remove();
                System.out.println("Goal eliminado correctamente.");
                return;
            }
        }
        System.out.println("Usuario no encontrado.");
    }

    public void getGoals() {
        for (Goal goal : goals) {
            System.out.println(goal.toString());
        }
    }
}
