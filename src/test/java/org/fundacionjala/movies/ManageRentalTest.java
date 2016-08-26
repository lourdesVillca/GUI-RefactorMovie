package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ManageRental}
 */
public class ManageRentalTest {

    private static final int DELTA = 0;

    private String customerName;

    private String releaseMovieTitle;

    private String regularMovieTitle;

    private ManageRental manageRental;

    @Before
    public void setUp() {
        customerName = "Lourdes";
        releaseMovieTitle = "Independence Day";
        regularMovieTitle = "Crepusculo";
        manageRental = new ManageRental(new Customer(customerName));
    }

    @Test
    public void test_calculateTotalFrequentRenterPoints() {
        final int daysRented = 2;
        final int actualResult = 3;
        manageRental.addRental(new Rental(new ReleaseMovie(releaseMovieTitle), daysRented));
        manageRental.addRental(new Rental(new RegularMovie(regularMovieTitle), daysRented));
        assertEquals(actualResult, manageRental.calculateTotalFrequentRenterPoints());
    }

    @Test
    public void test_calculateTotalAmount() {
        final int daysRented = 2;
        final double actualResult = 8;
        manageRental.addRental(new Rental(new ReleaseMovie(releaseMovieTitle), daysRented));
        manageRental.addRental(new Rental(new RegularMovie(regularMovieTitle), daysRented));
        assertEquals(actualResult, manageRental.calculateTotalAmount(), DELTA);
    }

}
