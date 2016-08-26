package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link RegularMovie}
 */
public class ReleaseMovieTest {

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
        Movie movie = new ReleaseMovie(releaseMovieTitle);
        assertEquals(actualResult, movie.calculateAmount(daysRented), DELTA);
    }

    @Test
    public void test_calculateFrequentRenterPointsToRentDaysEqualToOne() {
        final int daysRented = 1;
        final double actualResult = 1;
        Movie movie = new ReleaseMovie(releaseMovieTitle);
        assertEquals(actualResult, movie.calculateFrequentRenterPoints(daysRented), DELTA);
    }

    @Test
    public void test_calculateFrequentRenterPointsToRentDaysGreaterThanOne() {
        final int daysRented = 3;
        final double actualResult = 2;
        Movie movie = new ReleaseMovie(releaseMovieTitle);
        assertEquals(actualResult, movie.calculateFrequentRenterPoints(daysRented), DELTA);
    }

}
