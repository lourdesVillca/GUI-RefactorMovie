package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by LourdesVillca on 8/24/2016.
 */
public class CustomerTest {
    private String customerName;
    private String releaseMovieTitle;
    private String regularMovieTitle;
    private Customer customer;

    @Before
    public void initializeVariables() {
        customerName = "Lourdes";
        releaseMovieTitle = "Independence Day";
        regularMovieTitle = "Crepusculo";
        customer = new Customer(customerName);
    }

    @Test
    public void test_calculateTotalFrequentRenterPoints() {
        int daysRented = 2;
        final int actualResult = 3;
        customer.addRental(new Rental(new ReleaseMovie(releaseMovieTitle), daysRented));
        customer.addRental(new Rental(new RegularMovie(regularMovieTitle), daysRented));
        assertEquals(actualResult, customer.calculateTotalFrequentRenterPoints());
    }

    @Test
    public void test_calculateTotalAmount() {
        int daysRented = 2;
        final double actualResult = 8;
        customer.addRental(new Rental(new ReleaseMovie(releaseMovieTitle), daysRented));
        customer.addRental(new Rental(new RegularMovie(regularMovieTitle), daysRented));
        assertEquals(actualResult, customer.calculateTotalAmount(), 0);
    }
}