package com.GermanicusCaesar;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Enter number 1#");
        Scanner forNumbers = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        boolean numberCheck = forNumbers.hasNextInt(); // this hasNextInt checks if a number was entered into the console

        if (numberCheck) {
            do {
                sum += forNumbers.nextInt();
                count++;
                System.out.println("Enter number " + count + "#");
            }

            while (count < 11);
            System.out.println(sum);

        } else {
            System.out.println("Not a numba");
        }

        forNumbers.nextLine();
        forNumbers.close();

//        while (count <= 10);{
//        if (numberCheck) {
//            int addedNumber = forNumbers.nextInt();
//            addedNumber += forNumbers.nextInt();
//            count++;
//
//
//            if (count <= 10){
//                System.out.println(addedNumber);
//
//            }
//
//
//        }}


//        while (count <= 10);


//            do {
//                numberCheck = forNumbers.nextInt();
//                count++;
//            }
//            while (count < 10);
//            {
//                numberCheck = forNumbers.nextInt();
////            count++;
//
//                numberCheck += 0;
//                System.out.println("The sum of the 10 numbers is: " + numberCheck);
//            }
//            ;
//        }
//        System.out.println("Invalid number.");
    }
}
