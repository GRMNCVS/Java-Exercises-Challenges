package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        System.out.println("10.000 at 2% interest =" + calculateInterest(10000, 2));
        System.out.println("10.000 at 3% interest =" + calculateInterest(10000, 3));
        System.out.println("10.000 at 4% interest =" + calculateInterest(10000, 4));

//        for(init; termination; increment)

        for (int i = 8; i > 1; i--) {
            System.out.println("10.000 at " + i + " % interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
//        for(interestRate = 0; interestRate < 8; interestRate++){
//            System.out.println("Well, yes. " + interestRate++);
//        }
        return (amount * (interestRate / 100));


    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;


        }
    }


