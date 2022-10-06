public class Main {
    public static void main(String[] args) {
        double myDouble = 20.00;
        double mySecondDouble = 80.00;
        double myMultiplierDouble = (myDouble + mySecondDouble) * 100.00;
        double myRemainder = myMultiplierDouble % 40.00;

        boolean outPut = (myRemainder == 0) ? true : false;

        if (!outPut) {
            System.out.println("My Demo has worked if this is not shown");
        }
        if (outPut) {
            System.out.println("My Demo has worked if this is shown");
        }

    }
}

//Demo
//        double myFirstValue = 20.00d;
//        double mySecondValue = 80.00d;
//        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
//        System.out.println("My Value Total is equal to " + myValuesTotal);
//        double myRemainderValue = myValuesTotal % 40.00d;
//        System.out.println("My Remainder Total is equal to " + myRemainderValue);
//
//        boolean isNoRemainder = (myRemainderValue == 0) ? true : false;
//        System.out.println("Is No remainder = " + isNoRemainder);
//
//        if (!isNoRemainder) {
//            System.out.println("Got Some remainder");
//        }
//        }