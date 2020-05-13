package com.GermanicusCaesar;

public class CarCoupe extends Car {

    private boolean isSlopingRoof;


    public CarCoupe() { //Constructor gol
    }

    public CarCoupe(boolean isICE, String engineType, boolean isManual, String transmissionType, boolean isSlopingRoof) {
        super(isICE, engineType, isManual, transmissionType ); //CONSTRUCTOR 2 Car class
        this.isSlopingRoof = isSlopingRoof;
    }

    //    public CarCoupe(boolean isSlopingRoof) {
//        super(true, "Diesel", false, "Automatic");
//        this.isSlopingRoof = isSlopingRoof;
//        System.out.println("This is a Coupe");
//    }

    public void accelerate(int rate) { //rate is the difference in speed from the current speed

//        int newSpeed = getCurrentSpeed() + rate; //getter from Vehicle 44

        setCurrentSpeed(rate); // Setter
        int newSpeed = getCurrentSpeed(); //Getter
        if (newSpeed == 0) {
            stopNow();
            changeGear(0);
        } else if (newSpeed > 0 && newSpeed <= 10) {
            changeGear(1);
        } else if (newSpeed > 10 && newSpeed <= 40) {
            changeGear(2);
        } else if (newSpeed > 40 && newSpeed <= 70) {
            changeGear(3);
        } else if (newSpeed > 70 && newSpeed <= 90) {
            changeGear(4);
        } else if (newSpeed > 90 && newSpeed <= 140) {
            changeGear(5);
        } else {
            changeGear(6);
            System.out.println("Speed is over 140 in 6th gear");
        }

        if (newSpeed > 0) {
        movement(newSpeed, getCurrentSpeed());
        }

    }
}
