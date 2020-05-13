package com.GermanicusCaesar;

public class House {

    private int houseNumber;
    private Room houseRoom;

    public House(Room houseRoom, int houseNumber) {
        this.houseRoom = houseRoom;
        this.houseNumber = houseNumber;
        houseRoom.wallsDetails();
    }

//    public Room getHouseRoom() {
//        System.out.println(this.houseRoom);
//        return houseRoom;
//    }

    // then add at least one method to hide the object e.g. not using a getter
    // but to access the object used in composition within the main class

    public void wallsDetails() {
        houseRoom.wallsDetails();
    }


    // Add at least one method to access an object via a getter and
    // then that objects public method as you saw in the previous video




}

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.
