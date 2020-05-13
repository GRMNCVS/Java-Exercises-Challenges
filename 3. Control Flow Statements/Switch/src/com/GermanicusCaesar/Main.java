package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

//        int value = 4;
//        if (value == 1) {
//            System.out.println("Value was 1.");
//        } else if (value == 2) {
//            System.out.println("Value was 2.");
//        } else {
//            System.out.println("Was not 1 or 2.");
//        }
//
//        int switchValue = 5;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Was a 3, 4, 5 or a 6 ");
//                System.out.println("It was actually a  " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;

            char newChar = 'G';

            switch (newChar) {
                case 'A':
                    System.out.println("A was found.");
                    break;
                case 'B':
                    System.out.println("B was found.");
                    break;
                case 'C':
                    System.out.println("C was found.");
                    break;
                case 'D':
                    System.out.println("D was found.");
                    break;

                default:
                    System.out.println("None were found!");
                    break;


            }

            String month = "January ";
            switch(month.toLowerCase()) {
                case "january":
                    System.out.println("Month 1");
                    break;
                case "FEBRUARY":
                    System.out.println("Month 2");
                    break;
                default:
                    System.out.println("The other 10 following months.");
                    break;
            }


        }


    }
