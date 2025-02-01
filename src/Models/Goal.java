package Models;

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

    public void setGoalId(Integer goalId) {
        this.goalId = goalId;
    }

    public String getGoalTittle() {
        return goalTittle;
    }

    public void setGoalTittle(String goalTittle) {
        this.goalTittle = goalTittle;
    }

    @Override
    public String toString() {
        return "Goal{\n" +
                "goalId=" + goalId +
                ", \ngoalTittle='" + goalTittle + '\'' + "\n" +
                '}';
    }
}
