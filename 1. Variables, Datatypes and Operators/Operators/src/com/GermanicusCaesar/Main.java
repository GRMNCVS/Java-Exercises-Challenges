package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);

        result *= 10;
        System.out.println("Result is now " + result);

        result -=10;
        System.out.println("Result is now " + result);

        result /=10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true) // the == checks the assignment of = from above
            System.out.println("It's not an alien.");

        int topScore = 80;
        if (topScore < 100) // ==100 wil show, != if it's not equal to 100
            System.out.println("You got the top score!");

        int secondTopScore = 80;
        if ((topScore >= secondTopScore) && (topScore < 100))
            System.out.println("Greater than the 2nd top score and less than 100.");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("The OR operator is true.");

        int newValue = 50;
        if (newValue == 50);
        System.out.println("This is an error, eh.");

        boolean isCar = false;
        if (isCar == true) //if, with 1 = only works for boolean, == also works for boolean, primitive int only 1 =
            System.out.println("CAR, this shouldn't happen!");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
        System.out.println(wasCar);
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html

        double twenty = 20;
        double eighty = 80;
        double tweighty = twenty + eighty;
        double five = tweighty * 25;

        double forty = 40;
        double remainder = five % forty;
        if (remainder <= 20)
            System.out.println("Total was over the limit");









    }
}
