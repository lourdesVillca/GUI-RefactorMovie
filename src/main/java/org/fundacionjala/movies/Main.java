package org.fundacionjala.movies;

public class Main {
    public static void main(String[] args) {
        ManageRental manageRental = new ManageRental(new Customer("Test"));
        manageRental.addRental(new ReleaseRentedMovie(new Movie("The Revenant"), 2));
        manageRental.addRental(new RegularRentedMovie(new Movie("Terminator"), 2));
        System.out.println(manageRental.statement());
    }

}
