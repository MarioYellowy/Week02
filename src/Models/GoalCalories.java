package Models;

public class GoalCalories extends Goal {
    private String goalDescription;
    private float goalCaloriesToBurn, goalCaloriesBurned;

    public GoalCalories(Integer goalId, String goalTittle, String goalDescription, float goalCaloriesToBurn, float goalCaloriesBurned) {
        super(goalId, goalTittle);
        this.goalDescription = goalDescription;
        this.goalCaloriesToBurn = goalCaloriesToBurn;
        this.goalCaloriesBurned = goalCaloriesBurned;
    }

    public String getGoalDescription() {
        return goalDescription;
    }

    public void setGoalDescription(String goalDescription) {
        this.goalDescription = goalDescription;
    }

    public float getGoalCaloriesToBurn() {
        return goalCaloriesToBurn;
    }

    public void setGoalCaloriesToBurn(float goalCaloriesToBurn) {
        this.goalCaloriesToBurn = goalCaloriesToBurn;
    }

    public float getGoalCaloriesBurned() {
        return goalCaloriesBurned;
    }

    public void setGoalCaloriesBurned(float goalCaloriesBurned) {
        this.goalCaloriesBurned = goalCaloriesBurned;
    }
}
