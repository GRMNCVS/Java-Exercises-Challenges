package com.GermanicusCaesar;

public class Car extends Vehicle{

    private boolean isICE;
    private String engineType;
    private boolean isManual;
    private String transmissionType;

    private int currentGear;

    public Car(){//Constructor gol

    }

    public Car(boolean isICE, String engineType, boolean isManual, String transmissionType) { //CONSTRUCTOR 2 Car class
        super("It is a car.", 4); //from Vehicle class line 13 constructor
        this.isICE = isICE;
        this.engineType = engineType;
        this.isManual = isManual;
        this.transmissionType = transmissionType;
    }

    public void changeGear(int ourCurrentGear) {
        this.currentGear = ourCurrentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    @Override
    public void movement(int speed, int direction) {
        super.movement(speed, direction); //why can I add values here, what's the difference
//        System.out.println("OVERRIDDEN METHOD IN CAR CLASS MOVE Car.changeSpeed() : Velocity " + speed + " direction " + direction);
    }

    @Override
    public void stopNow() {
        super.stopNow();
        System.out.println("The car isn't moving or has stopped moving.");
    }
}
