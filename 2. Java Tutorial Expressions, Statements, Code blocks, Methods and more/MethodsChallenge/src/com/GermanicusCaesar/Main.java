package com.GermanicusCaesar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //for first methode
        String playerName = "Alex";
        int playerPosition = 5;

        String playerName1 = "Daniel";
        int playerPosition1 = 3;


//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Enter player name: ");
//        String playerNameInput = keyboard.nextLine();
//
//        System.out.println("Enter player position: ");
//        int playerPositionInput = keyboard.nextInt();

        //for second methode
        int playerScore1 = 1500;
        int playerScore2 = 900;
        int playerScore3 = 400;
        int playerScore4 = 50;

        displayHighScorePosition(playerName1, playerPosition1);

        System.out.println("Player score is : "+calculateHighScorePosition(playerScore1));
        System.out.println("Player score is : "+calculateHighScorePosition(playerScore2));
        System.out.println("Player score is : "+calculateHighScorePosition(playerScore3));
        System.out.println("Player score is : "+calculateHighScorePosition(playerScore4));

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        }
        return 4;

    }
}
