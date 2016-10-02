package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Test for {@link Rental}
 */
public class RentalTest {

    private String movieTitle;

    @Before
    public void setUp() {
        movieTitle = "Independence Day";
    }

    @Test
    public void test_calculateFrequentRenterPointsForNewReleaseMovieWithRentedDaysMinorThanTwo() {
        final int daysRented = 1;
        Rental rental = new ReleaseRentedMovie(new Movie(movieTitle), daysRented);
        final int actualResult = 1;
        assertEquals(actualResult, rental.calculateFrequentRenterPoints());
    }

    @Test
    public void test_calculateFrequentRenterPointsForNewReleaseMovieWithRentedDaysGreaterThanTwo() {
        final int daysRented = 3;
        Rental rental = new ReleaseRentedMovie(new Movie(movieTitle), daysRented);
        final int actualResult = 2;
        assertEquals(actualResult, rental.calculateFrequentRenterPoints());
    }

    @Test
    public void test_calculateFrequentRenterPointsForOtherKindOfMovie() {
        final int daysRented = 2;
        Rental rental = new RegularRentedMovie(new Movie(movieTitle), daysRented);
        final int actualResult = 1;
        assertEquals(actualResult, rental.calculateFrequentRenterPoints());
    }

    @Test
    public void test_rentalIsCreated() {
        final int daysRented = 2;
        Rental rental = new RegularRentedMovie(new Movie(movieTitle), daysRented);
        assertNotNull(rental);
    }

}

