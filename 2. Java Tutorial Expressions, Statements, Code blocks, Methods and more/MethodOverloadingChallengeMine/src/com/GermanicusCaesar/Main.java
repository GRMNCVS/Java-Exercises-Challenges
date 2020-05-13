package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        double ftintocm = calcFeetandInchestoCentimeters(6, 12);

        System.out.println(ftintocm);

        System.out.println(calcFeetandInchestoCentimeters(6));


    }

    public static double calcFeetandInchestoCentimeters(double feet, double inches) {

//converting inches to centimeters = means multiplying a value in inches by 2.54
        if (!(feet >= 0) || !(inches >= 0 && inches <= 12)) {
            return -1;
        }
        double feetsToCentimeters = feet * 30.48;
        double inchesToCentimeters = inches * 2.54;
        return inchesToCentimeters + feetsToCentimeters;


//
//        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
//            return -1;
//        }
//        double feetsToCentimeters = feet * 30.48;
//        double inchesToCentimeters = inches * 2.54;
//
//        return inchesToCentimeters+feetsToCentimeters;

//        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
//            double feetsToCentimeters = feet * 30.48;
//            double inchesToCentimeters = inches * 2.54;
//
//            return inchesToCentimeters+feetsToCentimeters;
//        } else {
//            return -1;
//        }


    }

    public static double calcFeetandInchestoCentimeters (double inches){

        if (inches < 0){
            return -1;
        }
        double feetsFromInches = inches * 1.2;

        return calcFeetandInchestoCentimeters(feetsFromInches, 0);


//            double inches = calcFeetandInchestoCentimeters()  * 0.83;
//            System.out.println(i2 + " ft. in.");
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