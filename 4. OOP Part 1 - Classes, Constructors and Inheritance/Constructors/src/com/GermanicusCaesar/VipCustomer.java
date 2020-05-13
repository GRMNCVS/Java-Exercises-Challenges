package com.GermanicusCaesar;

public class VipCustomer {

    String name;
    double creditLimit;
    String email;

    public VipCustomer() {
        this("No name. ", 0.00, "No e-mail. ");
        System.out.println("No V.I.P. customer. ");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, String email) {
        this(name, 0.00, email );

        // this.name;
        // this.email; ^ instead of this(
    }






    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
