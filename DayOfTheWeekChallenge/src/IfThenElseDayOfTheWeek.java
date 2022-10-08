public class IfThenElseDayOfTheWeek {
    public static void ifThenElse(int Day) {
        if (Day == 6) {
            System.out.println("Saturday");
        } else if (Day == 0) {
            System.out.println("Sunday");
        } else if (Day == 1) {
            System.out.println("Monday");
        } else if (Day == 2) {
            System.out.println("Tuesday");
        } else if (Day == 3) {
            System.out.println("Wednesday");
        } else if (Day == 4) {
            System.out.println("Thursday");
        } else if (Day == 5) {
            System.out.println("Friday");
        } else {
            System.out.println("Invalid Day");
        }
    }
}
