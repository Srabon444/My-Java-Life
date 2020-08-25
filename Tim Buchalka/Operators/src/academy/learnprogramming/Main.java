package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("Result = " + result);

        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);

        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous Result =" + previousResult);

        result = result * 20;
        System.out.println("2 * 20 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        //result = result + 1
        result++;
        System.out.println("2 + 1 = " + result);

        //result = result + 1
        result--;
        System.out.println("3 - 1 = " + result);

        //result = result + 2
        result += 2; // 2 + 2 = 4
        System.out.println("2 + 2 = " + result);

        //result = result * 10
        result *= 10; // 4 * 10 = 40
        System.out.println("4 * 10 = " + result);

        //result = result / 3
        result /=3; // 40 * 3 = 13
        System.out.println("40 / 3 = " + result);

        //result = result - 2
        result -= 2; // 13 - 2 = 11
        System.out.println("13 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("I am scared of alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 82;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is True");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("Another way to do boolean");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 21;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        if (isEighteenOrOver) {
            System.out.println("Over Eighteen");
        }

        double variableX = 20.00d;
        double variableY = 80.00d;
        double myVariableTotal = (variableX + variableY) * 100.00d;
        System.out.println("myVariableTotal = " + myVariableTotal);
        double theRemainder = myVariableTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
