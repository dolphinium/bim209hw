package edu.estu;

public enum Size {
     SMALL,
     MEDIUM,
     LARGE;

    public static Size fromString(String size) {
        switch (size) {
            case "thin":
                return Size.SMALL;
            case "medium":
                return Size.MEDIUM;
            case "thick":
                return Size.LARGE;
            default:
                return null;
        }
    }
}
