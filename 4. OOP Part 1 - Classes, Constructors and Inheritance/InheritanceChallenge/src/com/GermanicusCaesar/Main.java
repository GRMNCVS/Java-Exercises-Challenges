package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {


        CarCoupe s65Coupe = new CarCoupe();
        s65Coupe.accelerate(50);//DO NOT USE CAPITAL LETTERS FOR CREATED OBJECT
//        s65Coupe.accelerate(50);
//        s65Coupe.getCurrentSpeed();
        s65Coupe.setCurrentSpeed(34);

        CarCoupe rs5 = new CarCoupe();




    }
}

// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.
