package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 15 == 0)) {
                count++;
                sum = sum + i;
                System.out.println("Found number " + i);
            }

            if (count == 5) {
                break;
            }
        }
            System.out.println("Sum = " + sum);



    }
}

//    int count = 0;
//
//        for (int i = 1; i <= 1000 / 15; i++) {
//                if ((15 % i == 0)) {
//                count++;
//                System.out.println("Ye, this the number: " + i);
//                if (count == 5) {
//                System.out.println("Five numbers counted.");
//                break;
//                }
//                } else break;
//
//                }
