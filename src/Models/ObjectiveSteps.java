package Models;

public class ObjectiveSteps {
    private Integer  goalId;
    private String objectiveDescription;
    private String[] objectiveStepsToTake, objectiveStepsTaken;

    public ObjectiveSteps(String objectiveDescription, String[] objectiveStepsToTake, String[] objectiveStepsTaken, Integer goalId) {
         this.objectiveDescription = objectiveDescription;
         this.objectiveStepsToTake = objectiveStepsToTake;
         this.objectiveStepsTaken = objectiveStepsTaken;
         this.goalId = goalId;
    }

    public String getObjectiveDescription() {
        return objectiveDescription;
    }

    public void setObjectiveDescription(String objectiveDescription) {
        this.objectiveDescription = objectiveDescription;
    }

    public String[] getObjectiveStepsToTake() {
        return objectiveStepsToTake;
    }

    public void setObjectiveStepsToTake(String[] objectiveStepsToTake) {
        this.objectiveStepsToTake = objectiveStepsToTake;
    }

    public String[] getObjectiveStepsTaken() {
        return objectiveStepsTaken;
    }

    public void setObjectiveStepsTaken(String[] objectiveStepsTaken) {
        this.objectiveStepsTaken = objectiveStepsTaken;
    }

    public Integer getGoalId() {
        return goalId;
    }

    public void setGoalId(Integer goalId) {
        this.goalId = goalId;
    }
}
