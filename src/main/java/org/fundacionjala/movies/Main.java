package org.fundacionjala.movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Test");
        customer.addRental(new Rental(new ReleaseMovie("The Revenant"), 2));
        customer.addRental(new Rental(new RegularMovie("Terminator"),2));
        System.out.println(customer.statement());
    }
}
