package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by LourdesVillca on 8/24/2016.
 */
public class ReleaseMovieTest {
    @Test
    public void test_calculateAmountToRentDaysMinorThanTwoDays() {
        final String releaseMovieTitle = "The Light Between Oceans";
        final int daysRented = 3;
        final double actualResult = 9;
        Movie movie = new ReleaseMovie(releaseMovieTitle);
        assertEquals(actualResult, movie.calculateAmount(daysRented), 0);
    }

}