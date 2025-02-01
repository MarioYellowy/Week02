package Services;

import Models.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseService {

    public ExerciseService() {}

    ArrayList<Exercise> exercises = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public Exercise createExercise() {
        System.out.println("Ingresa el id del ejercicio");
        Integer exerciseId = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingresa el nombre del ejercicio");
        String exerciseName = sc.nextLine();

        System.out.println("Ingresa la descripcion del ejercicio");
        String exerciseDescription = sc.nextLine();

        Exercise newExercise = new Exercise(exerciseId, exerciseName, exerciseDescription);
        exercises.add(newExercise);
        System.out.println("Ejercicio agregado con exito");

        return newExercise;
    }

    public void editExercise() {
        System.out.println("Ingresa el id del ejercicio a editar");
        Integer inputId = sc.nextInt();
        for(Exercise exercise : exercises) {
            Integer exerciseId = exercise.getExerciseId();
            String exerciseName, exerciseDescription;

            if (inputId == exerciseId) {
                System.out.println("Se actualizaran todos los campos");
                System.out.println("Inserta el nombre del ejercicio");
                exerciseName = sc.nextLine();
                exercise.setExerciseName(exerciseName);
                System.out.println("Inserta la descripcion del ejercicio");
                exerciseDescription = sc.nextLine();
                exercise.setExerciseDescription(exerciseDescription);
            } else {
                System.out.println("EL ejercicio con id: " + exerciseId + "no existe");
            }
        }
    }

    public void deleteExercise() {
        System.out.println("Por favor ingresa el id del ejercicio que se eliminara");
        Integer inputId = sc.nextInt();
        for(Exercise exercise : exercises) {
            Integer exerciseId = exercise.getExerciseId();
            if (exerciseId == inputId) {
                exercises.remove(exercise);
            }
        }
    }
}
