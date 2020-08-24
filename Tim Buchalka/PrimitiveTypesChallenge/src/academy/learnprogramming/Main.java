package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    byte myByte = 126;
	    short myShort = 64;
	    int myInt = 4565;
        long myLong = (50000 +
                (10 * (myByte + myShort + myInt)));
        System.out.println(myLong);

        short shortTotal = (short) (1000 + 10 *
                (myByte + myShort + myInt));
        System.out.println("Short Total = " + shortTotal);

    }
}
