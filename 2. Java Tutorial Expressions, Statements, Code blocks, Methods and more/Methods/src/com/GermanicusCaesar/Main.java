package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) { // <-- this is a METHOD, it is made by all the statements below
        boolean gameOver = true;
        int score = 800; //modify here to use different else below
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        calculateScore(true, 10000, 8, 200);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;

            return finalScore;
        } else {
            return -1;
        }
    }

}
