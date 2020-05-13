package com.GermanicusCaesar;

public class House {

    private int houseNumber;
    private Rooms houseRooms;

    //constr
    public House(int houseNumber, Rooms houseRooms) {
        this.houseNumber = houseNumber;
        this.houseRooms = houseRooms;
    }

    public void allHouseInformation(int houseNumber, Rooms allRooms){
        System.out.println(allRooms);

    }


    // them getters down here

    public int getHouseNumber() {
        return houseNumber;
    }

    public Rooms getHouseRooms() {
        return houseRooms;
    }
}
