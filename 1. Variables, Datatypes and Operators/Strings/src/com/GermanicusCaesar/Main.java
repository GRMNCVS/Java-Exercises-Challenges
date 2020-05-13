package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {
	// Datatypes, 8 primitive:
        // byte,
        // short,
        // int,
        // long,
        // float,
        // double,
        // char,
        // boolean.

        // string, it's a Class, not a primitive datatype, but we can use it as one.

        String myString = "That's a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", this' another one";
        System.out.println("myString is equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("That the result " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Last string" + lastString);
        double myDouble = 120.47d;
        lastString = lastString + myDouble;
        System.out.println("Last string double " + lastString);
    }
}
