package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int myValue = 1000;

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Overflown Max value = " + (myMaxIntValue + 1));
        System.out.println("Overflown Min value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        System.out.println("New technique to type large number = " + myMaxIntTest);


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Short Minimum Value = " + myMinShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Long Minimum Value = " + myMinLongValue);
        long myBigLongLiteralValue = 2_147_483_647_234L;
        System.out.println("My Big Long Literal Value = " + myBigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);
        System.out.println("myMinIntValue = " + myMinIntValue);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println("myNewShortValue = " + myNewShortValue );
    }
}
