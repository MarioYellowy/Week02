package Models;

import Enums.EGender;

public class User {

    private Integer userId, userAge;
    private String userName;
    private float userWeight;
    private EGender userGender;
    private Goal[] userGoal;
    private Reminder[] userReminder;
    private TrainingPlan[] userTrainingPlan;
    private WorkoutSession[] userWorkoutSession;
    private MetricsTracker[] userMetrics;

    public User(Integer userId, Integer userAge, String userName, float userWeight, EGender userGender) {
        this.userId = userId;
        this.userAge = userAge;
        this.userName = userName;
        this.userWeight = userWeight;
        this.userGender = userGender;

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public float getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(float userWeight) {
        this.userWeight = userWeight;
    }

    public EGender getUserGender() {
        return userGender;
    }

    public void setUserGender(EGender userGender) {
        this.userGender = userGender;
    }

    @Override
    public String toString() {
        return "User{\n" +
                "userId=" + userId +
                ", \nuserAge=" + userAge +
                ", \nuserName='" + userName + '\'' +
                ", \nuserWeight=" + userWeight +
                ", \nuserGender=" + userGender + "\n" +
                '}';
    }
}
