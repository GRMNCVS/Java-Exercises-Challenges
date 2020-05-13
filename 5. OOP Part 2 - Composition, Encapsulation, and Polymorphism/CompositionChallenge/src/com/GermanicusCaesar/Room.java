package com.GermanicusCaesar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Room {

    private String roomType;
    private int numberOfWalls;
    private int sizeOfWalls;
    private boolean Lights aa;

    //constructor


    public Room(String roomTypeConst, int numberOfWallsConst, int sizeOfWallsConst, boolean isXenonConstr) {
        this.roomType = roomTypeConst;
        this.numberOfWalls = numberOfWallsConst;
        this.sizeOfWalls = sizeOfWallsConst;
        isXenonConstr.isXenon();
    }

    //methods

    public void wallsDetails(){
        System.out.println("The room has " + numberOfWalls + " number of walls and the size of the walls is " + sizeOfWalls + " and it's a " + roomType);
    }

    //getter, we only use it when we have Private Variable/Class fields.


    private int getNumberOfWalls() {
        return numberOfWalls;
    }

    private int getSizeOfWalls() {

        return sizeOfWalls;
    }

    public Lights getIsXenon() {
        return Lights;
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