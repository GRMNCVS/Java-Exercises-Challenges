package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        sumDigits(-51);


    }

    public static int sumDigits(int number) {

        if (number < 10) {
            System.out.println("Invalid number.");
            return -1;
        }

//        if (number >= 10) {
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("The sum of its digits is " + sum);
        return sum;
//        }
//        return number;


    }
}
