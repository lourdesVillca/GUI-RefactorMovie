package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by LourdesVillca on 8/24/2016.
 */
public class RegularMovieTest {
    private String regularMovieTitle;

    @Before
    public void initializeVariables() {
        regularMovieTitle = "Independence Day";
    }

    @Test
    public void test_calculateAmountToRentDaysMinorThanTwoDays() {
        int daysRented = 1;
        final double actualResult = 2;
        Movie movie = new RegularMovie(regularMovieTitle);
        assertEquals(actualResult, movie.calculateAmount(daysRented), 0);
    }

    @Test
    public void test_calculateAmountToRentDaysMajorThanTwoDays() {
        int daysRented = 3;
        final double actualResult = 3.5;
        Movie movie = new RegularMovie(regularMovieTitle);
        assertEquals(actualResult, movie.calculateAmount(daysRented), 0);
    }

}