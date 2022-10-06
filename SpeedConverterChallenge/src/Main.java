public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10);

    }
}