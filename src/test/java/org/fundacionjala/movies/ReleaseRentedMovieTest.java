package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link RegularRentedMovie}
 */
public class ReleaseRentedMovieTest {

    public static final int DELTA = 0;

    private String releaseMovieTitle;

    @Before
    public void setUp() {
        releaseMovieTitle = "The Light Between Oceans";
    }

    @Test
    public void test_calculateAmountToRentDaysMinorThanTwoDays() {
        final int daysRented = 3;
        final double actualResult = 9;
        Rental rentedMovie = new ReleaseRentedMovie(new Movie(releaseMovieTitle), daysRented);
        assertEquals(actualResult, rentedMovie.calculateAmount(), DELTA);
    }

    @Test
    public void test_calculateFrequentRenterPointsToRentDaysEqualToOne() {
        final int daysRented = 1;
        final double actualResult = 1;
        Rental rentedMovie = new ReleaseRentedMovie(new Movie(releaseMovieTitle), daysRented);
        assertEquals(actualResult, rentedMovie.calculateFrequentRenterPoints(), DELTA);
    }

    @Test
    public void test_calculateFrequentRenterPointsToRentDaysGreaterThanOne() {
        final int daysRented = 3;
        final double actualResult = 2;
        Rental rentedMovie = new ReleaseRentedMovie(new Movie(releaseMovieTitle), daysRented);
        assertEquals(actualResult, rentedMovie.calculateFrequentRenterPoints(), DELTA);
    }

}
