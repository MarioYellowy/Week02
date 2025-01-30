public class Goal {
    private Integer goalId;
    private String goalTittle;

    public Goal(Integer goalId, String goalTittle) {
        this.goalId = goalId;
        this.goalTittle = goalTittle;
    }

    public Integer getGoalId() {
        return goalId;
    }

    public String getGoalTittle() {
        return goalTittle;
    }

    public void setGoalTittle(String goalTittle) {
        this.goalTittle = goalTittle;
    }
}
