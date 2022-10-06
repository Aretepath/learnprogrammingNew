package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMindByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My Minimum Byte Value is " + myMindByteValue);
        System.out.println("My Maximum Byte Value is " + myMaxByteValue);

        short myMindShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Minimum Short Value is " + myMindShortValue);
        System.out.println("My Maximum Short Value is " + myMaxShortValue);

        long myLongValue = 100L;
        long myMindLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My Minimum Long Value is " + myMindLongValue);
        System.out.println("My Maximum Long Value is " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMindByteValue /2); //Casting
        short myNewShortValue = (short) (myMindShortValue /2); //Casting

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);

    }
}