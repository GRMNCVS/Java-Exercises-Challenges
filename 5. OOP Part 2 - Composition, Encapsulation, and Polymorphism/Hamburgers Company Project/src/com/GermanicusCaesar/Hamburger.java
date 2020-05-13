package com.GermanicusCaesar;

public class Hamburger {

    private String hamburgerName;
    private String breadType;
    private String meatType;
    public double price;

    public void setWithBacon(boolean withBacon) {
        this.withBacon = withBacon;
    }

    private boolean withBacon;
    private boolean withTomato;
    private boolean withCheese;
    private boolean withGarlic;
    private boolean withLettuce;

    public Hamburger(String hamburgerName, String breadType, String meatType, double price) { //constructor
        this.hamburgerName = hamburgerName;
        this.breadType = breadType;
        this.meatType = meatType;
        this.price = price;
    }

    public void totalPrice(boolean withBacon, boolean withTomato, boolean withCheese, boolean withGarlic, boolean withLettuce) { //pricing them up

//        this.withBacon = withBacon;
//        this.withTomato = withTomato;
//        this.withCheese = withCheese;
//        this.withGarlic = withGarlic;
//        this.withLettuce = withLettuce;

        int numberOfAdditions = 0;

        if(withBacon == true){
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }

        if(withTomato == true){
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }

        if(withCheese == true){
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }

        if(withGarlic == true){
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }

        if(withLettuce == true){
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }

        if (numberOfAdditions > 4){
            System.out.println("Choose four or less ingredients, not more.");
        } else {
            System.out.println("Total price for your hamburger is: " + "\n" + this.price + "$");
        }

    }
}




// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.

// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).

// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).

// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.