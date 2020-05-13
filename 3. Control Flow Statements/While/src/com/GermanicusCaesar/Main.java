package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while (count != 6) {
            count++;
            System.out.println("Count value is " + count);
        }


        int forCount = 1;
        for (forCount = 1; forCount != 6; forCount++) {
            System.out.println("For count value was " + forCount);
        }

        count = 1;
        while (true) {
            if (count == 5) {
                break;
            }

            count++;
            System.out.println("While count value is " + count);

        }

        count = 6;
        do {
            System.out.println("Do While count value was " + count);
            count++;

            if (count > 15) {
                break;
            }

        } while (count != 6);
        // the do while prints at least ONCE. try count = 1, while count!= 6, it won't error like in while


    }
}
