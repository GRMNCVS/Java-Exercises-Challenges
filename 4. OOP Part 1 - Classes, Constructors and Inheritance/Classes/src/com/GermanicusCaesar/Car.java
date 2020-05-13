package com.GermanicusCaesar;

public class Car { //Car is a class, or a template/blueprint.

    private int doors;
    private int wheels;
    private String model; // <-- model here is a field
    private String engine; // <-- private can be accessed only by methods inside the class Car
    public String colour; // <-- public can be accessed outside of the class, like the Main

    //^this is a blueprint of a Car, a definition of the class

    public void setModel(String model){ // <-- model here is a parameter // ????modelS doesn't work why
        //^when we create a method, is then attached to all the objects of that class

        String validModel = model.toLowerCase();
        if(validModel.equals("s65 coupe") || validModel.equals("lfa")){

            this.model = model; //we update model from line 7 using a method, setModel. the keyword this. helps us with this
        } else {         //^ ????modelS doesn't work why
            this.model = "Unavailable model.";
        }
    }

    public String getModel() {
        return this.model; // <-- ".model;" here is a private field, as indicated by graphic hint while selecting
    }

}
