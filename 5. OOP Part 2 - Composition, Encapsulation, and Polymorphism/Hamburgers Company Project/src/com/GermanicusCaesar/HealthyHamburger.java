package com.GermanicusCaesar;

public class HealthyHamburger extends Hamburger {

    public HealthyHamburger(String meatType) {
        super("Healthy Hamburger", "Brown rye bread roll", meatType, 2.0);
    }

    public void totalPrice(double totalPrice, boolean withBacon, boolean withTomato, boolean withCheese, boolean withGarlic, boolean withLettuce,
                           boolean withOnion, boolean withSalad) {
        super.totalPrice(withBacon, withTomato, withCheese, withGarlic, withLettuce);

//        this.withBacon = withBacon;
//        this.withTomato = withTomato;
//        this.withCheese = withCheese;
//        this.withGarlic = withGarlic;
//        this.withLettuce = withLettuce;

        this.price = totalPrice;

        int numberOfAdditions = 0;

        if (withBacon == true) {
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }

        if (withTomato == true) {
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }

        if (withCheese == true) {
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }

        if (withGarlic == true) {
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }

        if (withLettuce == true) {
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }

        if (withOnion == true) {
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }

        if (withSalad == true) {
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }


        if (numberOfAdditions > 6) {
            System.out.println("Choose six or less ingredients, not more.");
        } else {
            System.out.println("Total price for your hamburger is: " + "\n" + this.price + "$");
        }

    }
}

// Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additional, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.