package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        INVALID_VALUE_MESSAGE = "Hello";
        getDurationString(61, 59);
        getDurationString(90);

    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            System.out.println("Invalid value.");
            return ("Invalid value.");
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println(hours + "h " + (remainingMinutes) + "m " + seconds + "s ");
        return hours + "h " + (remainingMinutes) + "m " + seconds + "s ";


    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value.");
            return "Invalid value.";
        }

            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;

            return getDurationString(minutes, remainingSeconds);

//            String x = getDurationString(minutes, seconds);
//            return x; // also works

    }

}
