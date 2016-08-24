package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LourdesVillca on 8/24/2016.
 */
public class CustomerTest {
    @Test
    public void verifyCalculateTotalFrequentRenterPoints() {
        final String customerName = "Lourdes";
        final String releaseMovieTitle = "Independence Day";
        final String regularMovieTitle = "Crepusculo";
        final int daysRented = 2;
        final int actualResult = 3;
        Customer customer = new Customer(customerName);
        customer.addRental(new Rental(new ReleaseMovie(releaseMovieTitle), daysRented));
        customer.addRental(new Rental(new RegularMovie(regularMovieTitle), daysRented));
        assertEquals(actualResult, customer.calculateTotalFrequentRenterPoints());
    }

    @Test
    public void verifyCalculateTotalAmount() {
        final String customerName = "Lourdes";
        final String releaseMovieTitle = "Independence Day";
        final String regularMovieTitle = "Crepusculo";
        final int daysRented = 2;
        final double actualResult = 8;
        Customer customer = new Customer(customerName);
        customer.addRental(new Rental(new ReleaseMovie(releaseMovieTitle), daysRented));
        customer.addRental(new Rental(new RegularMovie(regularMovieTitle), daysRented));
        assertEquals(actualResult, customer.calculateTotalAmount(), 0);
    }
}