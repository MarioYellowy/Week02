import java.time.LocalDateTime;
import java.util.List;

public class WorkoutSession implements ITrackable {
    private Integer workoutSessionId;
    private LocalDateTime workoutSessionDate;
    private List<PhysicalActivity> activities;

    public WorkoutSession(Integer workoutSessionId, LocalDateTime workoutSessionDate, List<PhysicalActivity> activities) {
        this.workoutSessionId = workoutSessionId;
        this.workoutSessionDate = workoutSessionDate;
        this.activities = activities;
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

    public List<PhysicalActivity> getActivities() {
        return activities;
    }

    public void setActivities(List<PhysicalActivity> activities) {
        this.activities = activities;
    }
}
