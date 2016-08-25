package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by lourdesVillca on 8/23/2016.
 */
public class RentalTest {
    private String movieTitle;

    @Before
    public void initializeVariables() {
        movieTitle = "Independence Day";
    }

    @Test
    public void test_calculateFrequentRenterPointsForNewReleaseMovie() {
        int daysRented = 2;
        Rental rental = new Rental(new ReleaseMovie(movieTitle), daysRented);
        final int actualResult = 2;
        assertEquals(actualResult, rental.calculateFrequentRenterPoints());

    }

    @Test
    public void test_calculateFrequentRenterPointsForOtherKindOfMovie() {
        int daysRented = 2;
        Rental rental = new Rental(new RegularMovie(movieTitle), daysRented);
        final int actualResult = 1;
        assertEquals(actualResult, rental.calculateFrequentRenterPoints());
    }

    @Test
    public void test_rentalIsCreated() {
        int daysRented = 2;
        Rental rental = new Rental(new RegularMovie(movieTitle), daysRented);
        assertNotNull(rental);
    }
}