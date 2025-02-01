package Models;

public class Exercise {
    private Integer exerciseId;
    private String exerciseName, exerciseDescription;

    public Exercise(Integer exerciseId, String exerciseName, String exerciseDescription) {
        this.exerciseId = exerciseId;
        this.exerciseName = exerciseName;
        this.exerciseDescription = exerciseDescription;
    }

    public Integer getExerciseId() {
        return exerciseId;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getExerciseDescription(String exerciseDescription) {
        return exerciseDescription;
    }

    public void setExerciseDescription(String exerciseDescription) {
        this.exerciseDescription = exerciseDescription;
    }
}
