package com.GermanicusCaesar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount accountBozo = new BankAccount(); //(127, 9.00, "Schizo Slombozo", "mmbozo@clown.cl", 112911 );
        System.out.println(accountBozo.getBalance());

        BankAccount accountBozgo = new BankAccount("Bozgo", "mbozgo@clown.cl", 194500);
        System.out.println(accountBozgo.getNumber() + " named " + accountBozgo.getName());

        //
        VipCustomer accountBozoVip = new VipCustomer("Bozo", 50.00, "bozo@clown.cl");
        System.out.println("Name: " + accountBozoVip.getName() + ", credit limit: " + accountBozoVip.getCreditLimit() + ", email: " +
                accountBozoVip.getEmail());

        //
        VipCustomer accountBozgoVip = new VipCustomer();
        System.out.println(accountBozoVip.getEmail() + accountBozoVip.getName() + accountBozoVip.getCreditLimit());

        //
        VipCustomer accountJokerVip = new VipCustomer("Joker", "joker@clown.cl");
        System.out.println();






    }
}
