package vn.edu.iuh.fit.enums;

public enum DayOfWeek {
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday");
    private String day;

    DayOfWeek(String day) {
        this.day = day;
    }
}
