package com.GermanicusCaesar;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int teeth, String coat) {
        super(name, 1, 1, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    private void chew(){
        System.out.println("Dog.chew() called.");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called, override to Dog, from Animal.");
        chew();
        super.eat();

    }

    public void walk() {
        System.out.println("DOG CLASS Dog.walk() called");
        super.move(5); //this super.move one is inherited from the Animal class
    }

    public void run() {
        System.out.println("DOG CLASS Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("DOG CLASS Dog.moveLegs() called");
//        move(10); //this move is a method called from Dog class

    }

    @Override
    public void move(int speed) {
        System.out.println("DOG CLASS Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
