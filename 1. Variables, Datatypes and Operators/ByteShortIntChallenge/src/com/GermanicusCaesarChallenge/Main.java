package com.GermanicusCaesarChallenge;

public class Main {

    public static void main(String[] args) {

        byte VBN = (byte) (-100); //VBN = Variable Byte Number
        short VSN = (short) (200);
        int VIN = 1_000;

        long RESULT = (long) (50_000L + 10L * (VBN + VSN + VIN));
        System.out.println(RESULT);

    }
}
