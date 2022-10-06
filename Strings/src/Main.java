public class Main {
    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        String myString = "This is a string";
        System.out.println("My String is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My String is equal to " + myString);
        myString = myString + " \u00A9 2022";
        System.out.println("My String is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myIntValue = 50;
        lastString = lastString + myIntValue;
        System.out.println("Last String is equal to " + lastString);

        double doubleNumber = 120.56d;
        lastString = lastString + doubleNumber;
        System.out.println("Last String is equal to " + lastString);

    }
}