package com.GermanicusCaesar;

public class Rooms {

    private String roomType;
    private RoomWindows windows;

    //constr
    public Rooms(String roomType, RoomWindows windows) {
        this.roomType = roomType;
        this.windows = windows;
    }

    // them getters down here

    public String getRoomType() {
        return roomType;
    }

    public RoomWindows getWindows() {
        return windows;
    }
}
