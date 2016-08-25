package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by LourdesVillca on 8/24/2016.
 */
public class ChildrenMovieTest {
    String childrenMovieTitle;

    @Before
    public void initializeVariables() {
        childrenMovieTitle = "Space Dogs: Adventure to the Moon ";
    }

    @Test
    public void test_calculateAmountToRentDaysMinorThanThreeDays() {
        final int daysRented = 2;
        final double actualResult = 1.5;
        Movie movie = new ChildrenMovie(childrenMovieTitle);
        assertEquals(actualResult, movie.calculateAmount(daysRented), 0);
    }

    @Test
    public void test_calculateAmountToRentDaysMajorThanThreeDays() {
        final int daysRented = 4;
        final double actualResult = 3;
        Movie movie = new ChildrenMovie(childrenMovieTitle);
        assertEquals(actualResult, movie.calculateAmount(daysRented), 0);
    }

}