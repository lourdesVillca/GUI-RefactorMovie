package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LourdesVillca on 8/24/2016.
 */
public class ChildrenMovieTest {
    @Test
    public void verifyCalculateAmountToRentDaysMinorThanThreeDays() {
        final String childrenMovieTitle = "Space Dogs: Adventure to the Moon ";
        final int daysRented = 2;
        final double actualResult = 1.5;
        Movie movie = new ChildrenMovie(childrenMovieTitle);
        assertEquals(actualResult, movie.calculateAmount(daysRented), 0);
    }

    @Test
    public void verifyCalculateAmountToRentDaysMajorThanThreeDays() {
        final String childrenMovieTitle = "Space Dogs: Adventure to the Moon ";
        final int daysRented = 4;
        final double actualResult = 3;
        Movie movie = new ChildrenMovie(childrenMovieTitle);
        assertEquals(actualResult, movie.calculateAmount(daysRented), 0);
    }

}