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
        manageRental.addRental(new ReleaseRentedMovie(new Movie(releaseMovieTitle), daysRented));
        manageRental.addRental(new RegularRentedMovie(new Movie(regularMovieTitle), daysRented));
        assertEquals(actualResult, manageRental.calculateTotalFrequentRenterPoints());
    }

    @Test
    public void test_calculateTotalAmount() {
        final int daysRented = 2;
        final double actualResult = 8;
        manageRental.addRental(new ReleaseRentedMovie(new Movie(releaseMovieTitle), daysRented));
        manageRental.addRental(new RegularRentedMovie(new Movie(regularMovieTitle), daysRented));
        assertEquals(actualResult, manageRental.calculateTotalAmount(), DELTA);
    }

    @Test
    public void test_statementResult() {
        StringBuilder expectedResult = new StringBuilder("Rental Record for Lourdes\n");
        expectedResult.append("\tIndependence Day\t6.0\n");
        expectedResult.append("\tCrepusculo\t2.0\n");
        expectedResult.append("Amount owed is 8.0\n");
        expectedResult.append("You earned 3 frequent renter points");
        final int daysRented = 2;
        ManageRental manageRental = new ManageRental(new Customer(customerName));
        manageRental.addRental(new ReleaseRentedMovie(new Movie(releaseMovieTitle), daysRented));
        manageRental.addRental(new RegularRentedMovie(new Movie(regularMovieTitle), daysRented));
        assertEquals(expectedResult.toString(), manageRental.statement());
    }

}
