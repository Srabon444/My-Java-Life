import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("My int value " + myIntValue);
        System.out.println("Another my int value: " + anotherIntValue);

        anotherIntValue++;
        System.out.println("My int value " + myIntValue);
        System.out.println("Another my int value: " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherMyIntArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anothermyIntArray = " + Arrays.toString(anotherMyIntArray));

        anotherMyIntArray[0] = 1;

        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change anothermyIntArray = " + Arrays.toString(anotherMyIntArray));

        anotherMyIntArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("After modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After modify anothermyIntArray = " + Arrays.toString(anotherMyIntArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 5;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
