public class User {

    private Integer userId, userAge;
    private String userName;
    private float userWeight;
    private char userGender;

    public User(Integer userId, Integer userAge, String userName, float userWeight, char userGender) {
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

    public char getUserGender() {
        return userGender;
    }

    public void setUserGender(char userGender) {
        this.userGender = userGender;
    }
}
