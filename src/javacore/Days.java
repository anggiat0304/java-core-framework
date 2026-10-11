package javacore;

public class Days {
    public static void main(String[] args) {
        System.out.println(DayOfWeek.SUNDAY.name());
        System.out.println(DayOfWeek.SUNDAY.getAbbreviation());
        System.out.println(DayOfWeek.SUNDAY.ordinal());
        System.out.println(DayOfWeek.valueOf("SUNDAY"));
        System.out.println(DayOfWeek.SUNDAY);
    }
}
