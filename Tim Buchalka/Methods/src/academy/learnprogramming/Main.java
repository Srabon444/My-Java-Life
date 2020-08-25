package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        calculateScore(gameOver, score, levelCompleted, bonus); //It is good idea to write this (above) way.
        //Easy to rad the values. Hard coding is not easy to read

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 20000;
        levelCompleted = 20;
        bonus = 5000;
        returnCalculateScore(gameOver, score, levelCompleted, bonus);

        score = 20000;
        levelCompleted = 20;
        bonus = 5000;
        int highScore = printInMainCalculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your high score was " + highScore);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ashraful", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Akhi", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Shukhy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Naeem", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Aziz", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Harold", highScorePosition);


    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int returnCalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 200;
            return finalScore;
        } else return -1;

    }

    //Print in main method. //
    // Its a good idea to print in main method to keep the other method uncluttered

    public static int printInMainCalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 200;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else return -1;

    }

    //Challenge//

    // Create a method called displayHighScorePosition
    // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
    // You should display the players name along with a message like " managed to get into position " and the
    // position they got and a further message " on the high score table".
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score
    // it should return an in
    // the return data should be
    // 1 if the score is >=1000
    // 2 if the score is >=500 and < 1000
    // 3 if the score is >=100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900, 400 and 50

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into " + position +
                " on the high score table");
    }

    public static int calculateHighScorePosition(int highScore) {
//        if (highScore >= 1000) {
//            return 1;
//        } else if (highScore >= 500) {
//            return 2;
//        } else if (highScore >= 100) {
//            return 3;
//        } return 4;

        //Alternate way

        int position = 4;
        if (highScore >= 1000) {
            position = 1;
        } else if (highScore >= 500) {
            position = 2;
        } else if (highScore >= 100) {
            position = 3;
        }
        return position;
    }
}
