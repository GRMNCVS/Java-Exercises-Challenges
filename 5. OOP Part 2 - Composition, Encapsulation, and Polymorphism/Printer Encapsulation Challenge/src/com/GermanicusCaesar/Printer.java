package com.GermanicusCaesar;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {

        if (tonerLevel <= 100 && tonerLevel >= 1) {
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("-1");
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;

    }

//    public void fillToner() {
//            this.tonerLevel = 100;
//            System.out.println("Adding a new full Cartridge.");
//        }

//my trash
//    public void printPage(int pagesPrinted) {
//        if (isDuplex) {
//            tonerLevel = tonerLevel - 4 * pagesPrinted;
//            if (tonerLevel <= 100 && tonerLevel >= 1) {
//                System.out.println("Duplex "+pagesPrinted + " printed pages " + tonerLevel + " toner level left.");
//            }else{
//                fillToner();
//            }
//        } else {
//            tonerLevel = tonerLevel - 2 * pagesPrinted;
//            if (tonerLevel <= 100 && tonerLevel >= 1) {
//                System.out.println(pagesPrinted + " printed pages " + tonerLevel + " toner level left.");
//            }else{
//                fillToner();
//            }
//        }
//    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.isDuplex) { //this runs only when it's duplex
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println("Printed in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
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
