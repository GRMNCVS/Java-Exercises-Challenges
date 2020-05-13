package com.GermanicusCaesar;

public class BankAccount {

    private int number;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public BankAccount(){

        this(000, 0, "Default name", "Default email", 000000);
        //^ this is different than this. , it will use this constructor as default if no parameters entered
        // it must be the first line in the constructor method !!
        System.out.println("Empty constructer called.");
    }

    public BankAccount(int number, double balance, String name, String email, int phoneNumber){

        System.out.println("Account constructor with parameters is called:");

        this.number = number;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String name, String email, int phoneNumber) {
        this(0000, 0.00, name, email, phoneNumber);
        // ^ this ore the one below, are the same thing

//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.

    // Add some System.out.println's in the two methods above as well.


    public void deposit(double depositAmount) {

        this.balance += depositAmount;

        System.out.println("You added " + depositAmount + ". You now have: " + balance + ".");
//        + " to the already existing amount of: " + this.balance

    }

    public void withdrawFunds(double withdrawFunds) {


        if (this.balance > withdrawFunds) {
            this.balance -= withdrawFunds;
            System.out.println("You've withdrawn " + withdrawFunds + ". You have " + this.balance + " left.");
        } else {
            System.out.println("Bruh, you don't have that much. Amount available: " + this.balance);
        }

    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
