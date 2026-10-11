package javacore;

public enum DayOfWeek {
    MONDAY("MON"),TUESDAY("TUE"), WEDNESDAY("WED"), THURSDAY("THURS"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");
    private final String abbreviation;
    DayOfWeek(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
}
