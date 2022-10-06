public class Main {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value is = " + myMinFloatValue);
        System.out.println("Float Max Value is = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value is = " + myMinDoubleValue);
        System.out.println("Double Max Value is = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatCastValue = (float) 5.35;
        float myFloatNonCastValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatNonCastValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double numberOfPounds = 218.50d;
        double oneKG = 2.205d;
        double resultConversion = numberOfPounds / oneKG;
        System.out.println("My Weight in Kilograms is = " + resultConversion);

        //alternativeSolution
        double myNumberOfPounds = 218.50d;
        double poundInKG = 0.45359237d;
        double result = poundInKG * myNumberOfPounds;
        System.out.println("My Weight in Kilograms is = " + result);
    }
}