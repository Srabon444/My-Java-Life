package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Akhi", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(79);
        calculateScore();
        calcFeetAndInchesToCentimeter(7, 5);
        double centimeters = calcFeetAndInchesToCentimeter(5, 13);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeter(157);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore( int score) {
        System.out.println("Unknown Player " + "scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, No player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or Inches Parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = "
                + centimeters + " cm");
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeter(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to "
                + feet + "feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeter(feet, remainingInches);
    }


}
