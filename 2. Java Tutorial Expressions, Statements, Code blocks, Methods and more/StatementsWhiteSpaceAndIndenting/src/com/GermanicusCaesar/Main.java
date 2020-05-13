package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        //data type + expression and ; ==> valid java statement: int myVariable = 50;
        //expression: composed of variables, values and operators but no ; semicolon

        myVariable++;
        myVariable--;
        // those two above are making a complete statement

        System.out.println("Just a print." +
                " This is another," +
                " and another one.");
        // a complete java statement made of: a method call and the parenthesis and ;

        int anotherVariable = 50;
        myVariable--; // not recommended two statements on the same line

        //White Spacing, you can put as many, such below:
        int notMyVariable =
                10;

        //Indenting, to make the code more clear and clean to read and use, spacing
        //between classes, methods, data types etc

    }
}
