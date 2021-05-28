package com.GermanicusCaesar;

public class Hamburger {

    private String hamburgerName;
    private String breadType;
    private String meatType;
    public double price;
    public int numberOfAdditions = 0;


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

    public void initialPrice() {
        System.out.println("Initial price is: " + price);

    }


    public void totalIngredients() { //pricing them up


        if(withBacon){
            price += 0.20;
            numberOfAdditions += 1;
        }

        if(withTomato){
            this.price += 0.20;
            numberOfAdditions += 1;
        }

        if(withCheese){
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }

        if(withGarlic){
            this.price += 0.20;
            numberOfAdditions += 1;
        } else {
            this.price += 0.00;
        }

        if(withLettuce){
            this.price += 0.20;
            numberOfAdditions += 1;
        }

    }

    public void totalPrice() {
        totalIngredients();
        if (numberOfAdditions > 4) {
            System.out.println("Choose four or less ingredients, not more for your Hamburger.");
        } else {
            System.out.println("Total price for your hamburger is: " + "\n" + price + "$");
        }
    }

    public void setWithBacon(boolean withBacon) { //not indicated
        this.withBacon = true;
    }

    public void setWithTomato(boolean withTomato) {
        this.withTomato = withTomato;
    }

    public void setWithCheese(boolean withCheese) {
        this.withCheese = withCheese;
    }

    public void setWithGarlic(boolean withGarlic) {
        this.withGarlic = withGarlic;
    }

    public void setWithLettuce(boolean withLettuce) {
        this.withLettuce = withLettuce;
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