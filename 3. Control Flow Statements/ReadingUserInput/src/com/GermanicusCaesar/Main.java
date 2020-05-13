package com.GermanicusCaesar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner22 = new Scanner(System.in);
        //new is a keywoard, we use it to create an instance of Scanner. We're creating a new object of type scanner
        // The Java new keyword is used to create an instance of the class.

        System.out.println("Enter your year of birth here: ");

        boolean intCheck = scanner22.hasNextInt(); // <-- in case we add a letter to the year input keyboard

        if (intCheck) {

            int yearOfBirth = scanner22.nextInt(); //over here, we introduce an int and
            scanner22.nextLine(); //we do this so that the Scanner scanner22 allows us to also input on keyboard what follows,
            // ONLY after a number


            System.out.println("Enter your name here: ");
            String name = scanner22.nextLine(); //nextLine is a method from class scanner22

            int age = 2020 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", you're " + age + " years old.");
            } else {
                System.out.println("Can not parse the year of birth.");
            }

        }

        System.out.println("Wrong age bro, you added a letter.");


        scanner22.close();

    }
}
