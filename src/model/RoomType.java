package model;

public enum RoomType {
    SINGLE("3"),
    DOUBLE("2");

    public final String label;

    RoomType(String label) {
        this.label = label;
    }

    public static RoomType valueOfLabel(String label) {
        for (RoomType roomType : values()) {
            if (roomType.label.equals(label)) {
                return roomType;
            }
        }
        throw new IllegalArgumentException();
    }
}
