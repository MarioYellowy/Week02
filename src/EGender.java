public enum EGender {
    H("Hombre"), // Hombre
    M("Mujer"); // Mujer

    private final String description;

    EGender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static EGender fromString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Gender cannot be null");
        }
        for (EGender gender : EGender.values()) {
            if (gender.name().equalsIgnoreCase(input) || gender.description.equalsIgnoreCase(input)) {
                return gender;
            }
        }
        throw new IllegalArgumentException("Invalid gender: " + input);
    }

}
