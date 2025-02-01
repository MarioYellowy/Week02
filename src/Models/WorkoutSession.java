package Models;

public class WorkoutSession implements ITrackable {
    private Integer workoutSessionId;
    private float workoutSessionTime;

    public WorkoutSession(Integer workoutSessionId, float workoutSessionTime) {
        this.workoutSessionId = workoutSessionId;
        this.workoutSessionTime = workoutSessionTime;

    }

    public Integer getWorkoutSessionId() {
        return workoutSessionId;
    }

    public float getWorkoutSessionTime() {
        return workoutSessionTime;
    }

    public void setWorkoutSessionTime(float workoutSessionTime) {
        this.workoutSessionTime = workoutSessionTime;
    }

}
