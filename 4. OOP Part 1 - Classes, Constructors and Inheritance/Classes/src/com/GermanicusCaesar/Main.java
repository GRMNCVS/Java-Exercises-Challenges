package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {
        Car mercedes = new Car(); // <-- we have to initialize a Class, like this, in order to call it on line 9-10
        Car lexus = new Car();

        mercedes.colour = "Selenite Gray"; // <-- colour here is a public field
        mercedes.setModel("S65 Coupe"); // <-- setModel is a public void method

        System.out.println("Model " + mercedes.getModel());
    }
}
