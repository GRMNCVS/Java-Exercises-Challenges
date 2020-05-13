package com.GermanicusCaesar;

public class RoomWindows {

    private int numberOfWindows;
    private int length;
    private double height;

    //constr
    public RoomWindows(int numberOfWindows, int length, double height) {
        this.numberOfWindows = numberOfWindows;
        this.length = length;
        this.height = height;

        System.out.println("There's " + numberOfWindows + " window/windows of " + length + " length and " + height + " height.");
    }



    // them getters down here

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public int getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
}
