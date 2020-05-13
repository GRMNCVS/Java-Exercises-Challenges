package com.GermanicusCaesar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE; //wrapper class
        int max = Integer.MIN_VALUE;

        while(true) {

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {

                int number = scanner.nextInt();

                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }

            } else {
                break;
            }

            scanner.nextLine(); // handle input
        }

        System.out.println("min= "+ min + ", max= " + max);
        scanner.close();
    }


    }
//
//        Scanner minMaxScan = new Scanner(System.in);
//
//        int min = 0;
//        int max = 0;
//        boolean first = true;
//
//
//        while (true) {
//            System.out.println("Enter number:");
//            boolean isAnInt = minMaxScan.hasNextLine();
//
//
//            if (isAnInt) {
//
//                int number = minMaxScan.nextInt();
//
//                if(first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }
//
//                if (number > max){
//                    max = number;
//                }
//                if (number < min){
//                    min = number;
//                }
//
//            } else {
//                break;
//            }
//
//            minMaxScan.nextLine();
//
//        }
//
//        System.out.println("The minimum number is " + min + ", the maximum number is: " + max);
//        minMaxScan.close();
//
//    }

