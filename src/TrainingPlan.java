public class TrainingPlan {
    private Integer trainingPlanId;
    private String trainingPlanName;
    private ETrainingPlanType trainingPlanType;
    private PhysicalActivity physicalActivity;

    public TrainingPlan(Integer trainingPlanId, String trainingPlanName, ETrainingPlanType trainingPlanType, PhysicalActivity physicalActivity) {
        this.trainingPlanId = trainingPlanId;
        this.trainingPlanName = trainingPlanName;
        this.trainingPlanType = trainingPlanType;
        this.physicalActivity = physicalActivity;
    }

    public Integer getTrainingPlanId() {
        return trainingPlanId;
    }

    public String getTrainingPlanName() {
        return trainingPlanName;
    }

    public void setTrainingPlanName(String trainingPlanName) {
        this.trainingPlanName = trainingPlanName;
    }

    public ETrainingPlanType getTrainingPlanType() {
        return trainingPlanType;
    }

    public void setTrainingPlanType(ETrainingPlanType trainingPlanType) {
        this.trainingPlanType = trainingPlanType;
    }

    public PhysicalActivity getPhysicalActivity() {
        return physicalActivity;
    }

    public void setPhysicalActivity(PhysicalActivity physicalActivity) {
        this.physicalActivity = physicalActivity;
    }
}
