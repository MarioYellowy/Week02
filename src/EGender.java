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

}
