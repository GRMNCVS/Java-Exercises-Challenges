package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        Printer muhPrinters = new Printer(90, false);
//        muhPrinters.printPage(300);
//        muhPrinters.printPages(50);
        muhPrinters.printPages(1000);
        System.out.println(muhPrinters.getPagesPrinted());

//        OtherPrinter muhPrinter = new OtherPrinter(100,90,0,true);
//        muhPrinter.printPage(5000, 90, false );


    }
}

// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer

// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.