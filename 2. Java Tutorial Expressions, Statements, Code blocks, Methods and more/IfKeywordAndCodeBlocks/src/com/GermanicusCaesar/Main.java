package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000; //modify here to use different else below
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000 ) {
//            System.out.println("Your score was smaller than <5000 but bigger than >1000 ");
//        } else if (score < 1000) {
//            System.out.println("Less than 1000.");
//        } else {
//            System.out.println("Not less than 5000.");
//        }

        //this {} bracing the sout creates a code block
        //the if and sout above work together, if the if is not true, the sout won't show anything

        int score2 = 10_000;
        int levelCompleted2 = 8;
        int bonus2 = 200;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);

            int finalScore2 = score2 + (levelCompleted2 * bonus2);
            System.out.println("Your second score was " +finalScore2);
        }

        //int finalScore can only be used inside this code block {}, but levelCompleted can be used in both
        //variables inside a code block {} is a scope




    }
}
