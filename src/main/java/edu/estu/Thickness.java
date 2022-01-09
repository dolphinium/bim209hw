package edu.estu;

public enum Thickness {
    THIN,
    MEDIUM,
    THICK;

    public static Thickness fromString(String thickness) {
        switch (thickness) {
            case "thin":
                return THIN;
            case "medium":
                return MEDIUM;
            case "thick":
                return THICK;
            default:
                return null;
        }
    }
}
