package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Gabriel", 500);
        System.out.println(newScore);

        calculateScore(75);
        System.out.println();

        int scor = calculateScore("dan", 10);


    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

//    public static void calculateScore() {
// changing from int to void return data type, but the same parameters, (), won't change signature, hence won't work
//        System.out.println("No player name, no player score.");
//    }

    public static double calcFeetandInchestoCentimeters(double feet, double inches) {

        double centimeter = 1;
        double feet = inches * 12;
        double inches = 1 * centimeter;

        if (feet >= 0) {
            return feet;
        } else {
            return -1;
        }

        if (inches > 0 || inches <= 12) {
            return inches;
        } else {
            return -1;
        }
    }

        public static double calcFeetandInchestoCentimeters (double inches){

            if (inches < 0){
                return -1;
            } else {
                double i2 = calcFeetandInchestoCentimeters(5, 10);
                System.out.println(i2 + " ft. in.");
                return 0;
            }

        }


    }

