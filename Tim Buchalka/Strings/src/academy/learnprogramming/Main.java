package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + "Some more string";
        System.out.println("My string is equal to " + myString);

        String numberString = "65.25";
        numberString = numberString + "48.20";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last String is equal to " + lastString);
        
    }
}
