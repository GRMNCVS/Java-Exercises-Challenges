package com.GermanicusCaesar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;


        while(true){
            int order = count + 1;
            System.out.println("Enter number " + order + "#");

            boolean isANumber = myScanner.hasNextInt();

            if (isANumber){
                sum += myScanner.nextInt();
                count++;
                if (count == 10){
                    break;
                }

            } else {
                System.out.println("Not an integer.");
            }

            myScanner.nextLine();
        }

        System.out.println(sum);


        myScanner.close();
    }
}
