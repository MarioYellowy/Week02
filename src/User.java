public class User {

    private Integer userId, userAge;
    private String userName;
    private float userWeight;
    private EGender userGender;
    private Goal userGoal;
    private Reminder userReminder;
    private TrainingPlan userTrainingPlan;
    private WorkoutSession userWorkoutSession;
    private MetricsTracker userMetrics;

    public User(Integer userId, Integer userAge, String userName, float userWeight, EGender userGender, Goal userGoal, Reminder userReminder, TrainingPlan userTrainingPlan, WorkoutSession userWorkoutSession, MetricsTracker userMetrics) {
        this.userId = userId;
        this.userAge = userAge;
        this.userName = userName;
        this.userWeight = userWeight;
        this.userGender = userGender;
        this.userGoal = userGoal;
        this.userReminder = userReminder;
        this.userTrainingPlan = userTrainingPlan;
        this.userWorkoutSession = userWorkoutSession;
        this.userMetrics = userMetrics;
    }

    public Integer getUserId() {
        return userId;
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

    public Goal getUserGoal() {
        return userGoal;
    }

    public void setUserGoal(Goal userGoal) {
        this.userGoal = userGoal;
    }

    public Reminder getUserReminder() {
        return userReminder;
    }

    public void setUserReminder(Reminder userReminder) {
        this.userReminder = userReminder;
    }

    public TrainingPlan getUserTrainingPlan() {
        return userTrainingPlan;
    }

    public void setUserTrainingPlan(TrainingPlan userTrainingPlan) {
        this.userTrainingPlan = userTrainingPlan;
    }

    public WorkoutSession getUserWorkoutSession() {
        return userWorkoutSession;
    }

    public void setUserWorkoutSession(WorkoutSession userWorkoutSession) {
        this.userWorkoutSession = userWorkoutSession;
    }

    public MetricsTracker getUserMetrics() {
        return userMetrics;
    }

    public void setUserMetrics(MetricsTracker userMetrics) {
        this.userMetrics = userMetrics;
    }
}
