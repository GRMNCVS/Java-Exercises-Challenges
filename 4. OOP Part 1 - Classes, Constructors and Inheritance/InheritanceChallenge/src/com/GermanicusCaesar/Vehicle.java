package com.GermanicusCaesar;

public class Vehicle { //  CLASS

    private String vehicleType; //Instance Variables, Class Fields, Fields, Class Attributes
    private int wheels;

    private int currentSpeed;
    private int currentDirection;


    public Vehicle(){//Constructor gol

    }

    public Vehicle(String vehicleType, int wheels) {
        this.vehicleType = vehicleType;
        this.wheels = wheels;
    }

    public void movement(int speed, int direction){
        currentSpeed = speed;
        currentDirection = direction;

//        System.out.println("The vehicle moves at " + currentSpeed + "km/h at " + currentDirection + "angles." );

    }

    public void stopNow(){
        this.currentSpeed = 0;

    }

    //getters


    public String getVehicleType() {
        return vehicleType;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    // setters


    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.
