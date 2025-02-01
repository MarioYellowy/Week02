package Enums;

public enum ETrainingPlanType {
    FULL_BODY("Full body"),
    LOWER_BODY("Lower body"),
    UPPER_BODY("Upper body"),
    LEGS("Legs"),
    ARMS("Arms");

    private final String description;

    ETrainingPlanType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static ETrainingPlanType fromString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Type cannot be null");
        }
        for (ETrainingPlanType type : ETrainingPlanType.values()) {
            if (type.name().equalsIgnoreCase(input) || type.description.equalsIgnoreCase(input)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid gender: " + input);
    }
}
