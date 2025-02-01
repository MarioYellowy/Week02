package Models;

import java.time.LocalDateTime;
import java.util.List;

public class WorkoutSession implements ITrackable {
    private Integer workoutSessionId;
    private LocalDateTime workoutSessionDate;

    public WorkoutSession(Integer workoutSessionId, LocalDateTime workoutSessionDate) {
        this.workoutSessionId = workoutSessionId;
        this.workoutSessionDate = workoutSessionDate;

    }

    public Integer getWorkoutSessionId() {
        return workoutSessionId;
    }

    public LocalDateTime getWorkoutSessionDate() {
        return workoutSessionDate;
    }

    public void setWorkoutSessionDate(LocalDateTime workoutSessionDate) {
        this.workoutSessionDate = workoutSessionDate;
    }

}
