package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

//        Room bedroom1 = new Room("Bedroom",4,2);
//        bedroom1.wallsDetails();

//        House myHouse = new House(bedroom1, 1); /////

//        House myHouse = new House(new Room("Bedroom",4,2),1);
//        myHouse.getHouseRoom();

        House myHouse = new House(new Room("myBedroom", 4, 2, false), 43);
        myHouse.wallsDetails();

    }
}

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.