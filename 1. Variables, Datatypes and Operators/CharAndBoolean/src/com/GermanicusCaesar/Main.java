package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        char myChar = '\u0393'; //width of a char 16 (2 bytes)
        System.out.println("Unicode output: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char myRegister = '\u00AE';
        System.out.println("Register Symbol: " + myRegister);
    }
}
