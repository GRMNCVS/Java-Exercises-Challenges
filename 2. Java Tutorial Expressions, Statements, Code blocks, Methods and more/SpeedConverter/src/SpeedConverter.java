public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);

//        long milesPerHour = Math.round(kilometersPerHour / 1.609);
//        return milesPerHour;

    }

    public static void printConversion(double kilometersPerHour){

        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi /h");
        }


    }


}


package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        double ftintocm = calcFeetandInchestoCentimeters(5, 10);
        return Math.
                System.out.println(ftintocm);


    }

    public static double calcFeetandInchestoCentimeters(double feet, double inches) {


//        double centimeter = inches * 2.54;
//        double inches = centimeter * 0.39;
////        double feet = inches * 12;

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
            double inches = calcFeetandInchestoCentimeters()  * 0.83;
            System.out.println(i2 + " ft. in.");
            return calcFeetandInchestoCentimeters(inches);
        }

    }

}

//    public static double calcFeetandInchestoCentimeters (double inches){
//
//        if (inches < 0){
//            return -1;
//        } else {
//            double i2 = calcFeetandInchestoCentimeters(5, 10);
//            System.out.println(i2 + " ft. in.");
//            return 0;
//        }
//
//    }
