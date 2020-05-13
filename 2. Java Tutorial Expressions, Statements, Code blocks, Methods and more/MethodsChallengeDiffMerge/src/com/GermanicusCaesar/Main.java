package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScore("Tim", highScorePosition );

        highScorePosition = calculateHighScorePosition(900);
        displayHighScore("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScore("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScore("Gilbert", highScorePosition);

    }

    public static void displayHighScore(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table.");

    }

    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) {       // REMINDER! { } accolades represent a code block
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {  //if we remove this <- else here, with the code blocks that follows for return 4 as well
//            return 4;
//        }

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100); {
            position = 3;
        }

        return position;

    }

}
