public class PhysicalActivity {
    private Integer physicalActivityId;
    private String physicalActivityName;
    private float physicalActivityDuration;
    private EWorkoutIntensity physicalActivityIntensity;
    private Exercise exercise;

    public PhysicalActivity(Integer physicalActivityId, String physicalActivityName, float physicalActivityDuration, EWorkoutIntensity physicalActivityIntensity, Exercise exercise) {
        this.physicalActivityId = physicalActivityId;
        this.physicalActivityName = physicalActivityName;
        this.physicalActivityDuration = physicalActivityDuration;
        this.physicalActivityIntensity = physicalActivityIntensity;
        this.exercise = exercise;
    }

    public Integer getPhysicalActivityId() {
        return physicalActivityId;
    }

    public String getPhysicalActivityName() {
        return physicalActivityName;
    }

    public void setPhysicalActivityName(String physicalActivityName) {
        this.physicalActivityName = physicalActivityName;
    }

    public float getPhysicalActivityDuration() {
        return physicalActivityDuration;
    }

    public void setPhysicalActivityDuration() {
        this.physicalActivityDuration = physicalActivityDuration;
    }

    public EWorkoutIntensity getPhysicalActivityIntensity() {
        return physicalActivityIntensity;
    }

    public void setPhysicalActivityIntensity(EWorkoutIntensity physicalActivityIntensity) {
        this.physicalActivityIntensity = physicalActivityIntensity;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }
}
