package Others.Topics.Questions;

public enum Direction {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    Direction(String shortCode) {
        this.shortCode = shortCode;
    }

    private final String shortCode;

    public String getShortCode() {
        return shortCode;
    }
}
