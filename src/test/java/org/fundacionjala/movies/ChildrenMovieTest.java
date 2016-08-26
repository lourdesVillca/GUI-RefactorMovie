package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ChildrenMovie}
 */
public class ChildrenMovieTest {

    private static final int DELTA = 0;

    private String childrenMovieTitle;

    @Before
    public void setUp() {
        childrenMovieTitle = "Space Dogs: Adventure to the Moon ";
    }

    @Test
    public void test_calculateAmountToRentDaysMinorThanThreeDays() {
        final int daysRented = 2;
        final double actualResult = 1.5;
        Movie movie = new ChildrenMovie(childrenMovieTitle);

        assertEquals(actualResult, movie.calculateAmount(daysRented), DELTA);
    }

    @Test
    public void test_calculateAmountToRentDaysMajorThanThreeDays() {
        final int daysRented = 4;
        final double actualResult = 3;
        Movie movie = new ChildrenMovie(childrenMovieTitle);
        assertEquals(actualResult, movie.calculateAmount(daysRented), DELTA);
    }

    @Test
    public void test_calculateFrequentRentedPoint(){
        final int daysRented = 3;
        final double actualResult = 1;
        Movie movie = new ChildrenMovie(childrenMovieTitle);
        assertEquals(actualResult, movie.calculateFrequentRenterPoints(daysRented), DELTA);
    }

}
