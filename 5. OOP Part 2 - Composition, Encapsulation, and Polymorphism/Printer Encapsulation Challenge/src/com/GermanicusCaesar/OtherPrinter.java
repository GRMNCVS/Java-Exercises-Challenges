package com.GermanicusCaesar;

public class OtherPrinter {

    private int tonerLevel = 100;
    private int tonerLeft;
    private int pagesPrinted = 0;
    private boolean isDuplex = true;

    public OtherPrinter(int tonerLevel, int tonerLeft, int pagesPrinted, boolean isDuplex) {

        if (tonerLevel <= 100 && tonerLevel >= 1) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.tonerLevel = tonerLeft;
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;

    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            System.out.println("Adding a new full Cartridge.");
            return this.tonerLevel;
        } else {
            return -1;
        }

    }

    public int printPage(int pagesPrinted, int tonerLevel, boolean isDuplex) {

        if (tonerLevel <= 100 && tonerLevel >= 1) {
            if (isDuplex) {
                this.tonerLevel = tonerLevel - (pagesPrinted / 2);
                this.pagesPrinted = pagesPrinted;
            } else {
                this.tonerLevel = tonerLevel - (pagesPrinted / 4);
                this.pagesPrinted = pagesPrinted;
            }
            System.out.println("Printed pages " + pagesPrinted + ", toner level is " + this.tonerLevel);

        } else if (tonerLevel <= 0) {
            addToner(this.tonerLevel);
        }
        return -1;
    }



}

// Create a class and demonstrate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer

// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).


// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

