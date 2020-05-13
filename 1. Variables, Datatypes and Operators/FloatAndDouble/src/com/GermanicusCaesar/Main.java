package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 5 / 3; //width int 32 (4 bytes)
        float myFloatValue = 5f / 3f; //width float 32 (4 bytes)
        double myDoubleValue = 5d / 3d; //width double 64 (8 bytes)
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double oneKilogram = 1;
        double onePound = 0.45359237 * oneKilogram;
        double twoHundredPounds = 200 * onePound;

        System.out.println("Two Hundred Pounds = " + twoHundredPounds + " KG");

        double numPounds = 200;
        double kgFromPound = 0.45359237 * numPounds;

        System.out.println("Kilograms from Pounds = " + kgFromPound);

    }
}
