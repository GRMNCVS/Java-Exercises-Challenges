package com.GermanicusCaesar;

public class DeluxeHamburger extends Hamburger {

    private boolean chips;
    private boolean drink;

    public DeluxeHamburger() {
        super("Deluxe Hamburger", "Any.", "Beef", 3.5);
        this.chips = true;
        this.drink = true;
    }

    @Override
    public void initialPrice() {
        super.initialPrice();
    }

//    @Override
//    public void totalIngredients() {
//        super.totalIngredients();
//    }

    @Override
    public void totalPrice() {
        System.out.println("Total price for your Deluxe Hamburger is: " + "\n" + price + "$");
    }

//    //setters, not indicated to use them like this, but in this particular care it's ok
//    public static void setChips() {
//        //Static methods are the methods in Java that can be called without creating an object of class.
//        // They are referenced by the class name itself or reference to the Object of that class.
//        this.chips = true;
//    }
//
//    public void setDrink() {
//        this.drink = true;
//    }
}

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.