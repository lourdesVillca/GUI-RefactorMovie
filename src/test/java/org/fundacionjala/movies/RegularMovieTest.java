package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LourdesVillca on 8/24/2016.
 */
public class RegularMovieTest {
    @Test
    public void verifyCalculateAmountToRentDaysMinorThanTwoDays(){
        final String regularMovieTitle = "Independence Day";
        final int daysRented = 1;
        final double actualResult = 2;
        Movie movie = new RegularMovie(regularMovieTitle);
        assertEquals(actualResult, movie.calculateAmount(daysRented),0);
    }
    @Test
    public void verifyCalculateAmountToRentDaysMajorThanTwoDays(){
        final String regularMovieTitle = "Independence Day";
        final int daysRented = 3;
        final double actualResult = 3.5;
        Movie movie = new RegularMovie(regularMovieTitle);
        assertEquals(actualResult, movie.calculateAmount(daysRented),0);
    }

}