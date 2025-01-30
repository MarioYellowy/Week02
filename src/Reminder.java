import java.time.LocalDateTime;

public class Reminder {

    private Integer reminderId, userId;
    private String reminderTittle;
    private LocalDateTime reminderDate;

    public Reminder(Integer reminderId, Integer userId, String reminderTittle, LocalDateTime reminderDate) {
        this.reminderId = reminderId;
        this.userId = userId;
        this.reminderTittle = reminderTittle;
        this.reminderDate = reminderDate;
    }

    public Integer getReminderId() {
        return reminderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReminderTittle() {
        return reminderTittle;
    }

    public void setReminderTittle(String reminderTittle) {
        this.reminderTittle = reminderTittle;
    }

    public LocalDateTime getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(LocalDateTime reminderDate) {
        this.reminderDate = reminderDate;
    }
}
