package com.GermanicusCaesar;

public class Main {
    public static void main(String[] args) {


//        System.out.println(isEvenNumber(2));
//        System.out.println(isEvenNumber(161));

        int number = 4;
        int lastNumber = 20;
        int evenNumbersFound = 0;

        while (number < lastNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;// unlike breal;, it doesn't go further and goes back at the beginning of if statement and uses the next number
            } else {

                System.out.println("Even number " + number);

                evenNumbersFound++;
                if (evenNumbersFound == 5){
                    System.out.println("Total even numbers found " + evenNumbersFound);
                    break;
                }

            }




//            for (number = 4; number <= 20; number++) {
//                if (isEvenNumber(number)) {
//                    count++;
//                    System.out.println("One of the five even numbers is " + number);
//                    if (count == 5) {
//                        System.out.println("Exiting the for loop.");
//                        break;
//                    }
//                }
//            }

        }

    }

//            int count = 0;
//            if (!isEvenNumber(number)){
//                number++;
//                count++;
//                if (count == 5){
//                    System.out.println(number);
//                    break;
//                } else
//                    System.out.println(!isEvenNumber(number));
//
//            }





    public static boolean isEvenNumber(int number){
        if (number % 2 == 0) {
            return true;
        } return false;



    }




// this code below is a big crap

//    public static boolean isEvenNumber(int numberr) {
//
////        numberr = 5;
//        while (true) {
//            if ((numberr % 2 == 0)) {
////                numberr++;
//                System.out.println("Number is even " + numberr);
//                break;
//                if (numberr == 15){
//                    System.out.println("Exiting loop.");
//                }
//
//            }
//        }
//        return false;
//        }


    }


