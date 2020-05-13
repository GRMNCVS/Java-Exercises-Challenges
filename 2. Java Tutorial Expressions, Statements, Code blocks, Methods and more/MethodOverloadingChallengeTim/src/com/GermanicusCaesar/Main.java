package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        calcFeetandInchestoCentimeters(5, 10);

        calcFeetandInchestoCentimeters(-10);

    }

    public static double calcFeetandInchestoCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet/inches parameter.");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;

        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " centimeters.");
        return centimeters;

    }

    public static double calcFeetandInchestoCentimeters(double inches) {
        if (!(inches >= 0)) {
            System.out.println("Inches must be a positive number.");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetandInchestoCentimeters(feet, remainingInches);



    }

}