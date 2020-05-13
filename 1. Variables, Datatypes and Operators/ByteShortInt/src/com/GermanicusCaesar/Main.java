package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        //int has 32 width, 2^31
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotalValue = myMinValue / 2;
        System.out.println("myTotalValue = " + myTotalValue);


        // ^these data types are called variables (int),
        // these particular cases are called literals, a*b would not be a literal, it's an expression.

        // byte has 8 width
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // a byte is a different data type, it can only take a value between [-128; +128], they
        // use a quarter of an int space, and they're rather usefull

        // short has 16 width
        short myShortValue = 32_767;
        short myNewShortValue = (short) (myShortValue / 2);
        System.out.println(myNewShortValue);

        // [-32768;32767], uses twice the amount of space of a byte

        //long has 64 width, 2^363
        long myLongValue = 9_223_372_036_854_775_807L;


    }
}
