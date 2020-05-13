package com.GermanicusCaesar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner2 = new Scanner(System.in);

        System.out.println("Enter a number to count up to: ");
        int mainCount = myScanner2.nextInt();
        myScanner2.nextLine();

        int[] returnArray = readIntegers(mainCount);
        findMin(returnArray);

    }

    private static void findMin() {
    }

    public static int [] readIntegers(int count){
        System.out.println("You'll have to introduce " + count + " numbers:");

        int [] array = new int[count];

        Scanner MyScanner = new Scanner(System.in);
        int internalCount = 0; // as a suggestion

        for (internalCount = 0; internalCount < count; internalCount++){

            array[internalCount] = MyScanner.nextInt();
        }

//        MyScanner.close();

        System.out.println();
        return array;

    }

    public static int findMin(int[] array) {

        int minValue = Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++){
            int value = array[i];

            if(value < minValue){
                minValue = value;
            }
        }

        System.out.println("The minimum value of the array is: " + minValue + ".");
        return minValue;
    }

}

//    public static int findMin(int[] array) {
//        int minValue = array[0];
//        for (int i = 1; i < array.length; i++){
//            if(array[1] < minValue){
//                array[1] = minValue;
//            }
//        }
//
//        System.out.println("The minimum value of the array is: " + minValue);
//        return minValue;
//    }


//-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//
//        -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//
//        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
//        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//
//        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//        -Finally, print the minimum element in the array.
//
//        Tips:
//        -Assume that the user will only enter numbers, never letters
//        -For simplicity, create a Scanner as a static field to help with data input
//        -Create a new console project with the name eMinElementChallengef


//    public static int[] getIntegers(int number) {
//        System.out.println("Enter " + number + " integer values.\r");
//        int[] values = new int[number];
//
//        for(int i=0; i<values.length; i++) {
//            values[i] = scanner.nextInt();
//        }
//
//        return values;
//    }

// Method for getting the minimum value
//    public static int getMin(int[] inputArray){
//        int minValue = inputArray[0];
//        for(int i=1;i<inputArray.length;i++){
//            if(inputArray[i] < minValue){
//                minValue = inputArray[i];
//            }
//        }
//        return minValue;
//    }



//        if(internalCount < count){
//            internalCount++;
//
//        }