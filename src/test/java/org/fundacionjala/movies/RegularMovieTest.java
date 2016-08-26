package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link RegularMovie}
 */
public class RegularMovieTest {

    private static final int DELTA = 0;

    private String regularMovieTitle;

    @Before
    public void setUp() {
        regularMovieTitle = "Independence Day";
    }

    @Test
    public void test_calculateAmountToRentDaysMinorThanTwoDays() {
        final int daysRented = 1;
        final double actualResult = 2;
        Movie movie = new RegularMovie(regularMovieTitle);
        assertEquals(actualResult, movie.calculateAmount(daysRented), DELTA);
    }

    @Test
    public void test_calculateAmountToRentDaysMajorThanTwoDays() {
        final int daysRented = 3;
        final double actualResult = 3.5;
        Movie movie = new RegularMovie(regularMovieTitle);
        assertEquals(actualResult, movie.calculateAmount(daysRented), DELTA);
    }

    @Test
    public void test_calculateFrequentRentedPoint() {
        final int daysRented = 3;
        final double actualResult = 1;
        Movie movie = new RegularMovie(regularMovieTitle);
        assertEquals(actualResult, movie.calculateFrequentRenterPoints(daysRented), DELTA);
    }

}
