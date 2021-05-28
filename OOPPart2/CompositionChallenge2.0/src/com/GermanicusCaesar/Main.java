package com.GermanicusCaesar;

public class Main {

    public static void main(String[] args) {

        RoomWindows bedroomWindow1 = new RoomWindows(1, 2,1.5);
        Rooms myBedroom1 = new Rooms("Bedroom", bedroomWindow1);

        House myHouse = new House(43, myBedroom1);
        myHouse.allHouseInformation(43, myBedroom1);
        myHouse.getHouseNumber();

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