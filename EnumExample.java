
public class EnumExample {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day selectedDay = Day.WEDNESDAY;

        switch (selectedDay) {
            case MONDAY:
                System.out.println("It's Monday. Time to start the workweek!");
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("It's a weekday. Keep working.");
                break;
            case FRIDAY:
                System.out.println("It's Friday. Almost the weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend. Enjoy your time off.");
                break;
            default:
                System.out.println("Invalid day selected.");
        }
    }
}
