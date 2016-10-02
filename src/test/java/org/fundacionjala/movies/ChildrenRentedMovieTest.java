package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link ChildrenRentedMovie}
 */
public class ChildrenRentedMovieTest {

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
        Rental rentedMovie = new ChildrenRentedMovie(new Movie(childrenMovieTitle),daysRented);

        assertEquals(actualResult, rentedMovie.calculateAmount(), DELTA);
    }

    @Test
    public void test_calculateAmountToRentDaysMajorThanThreeDays() {
        final int daysRented = 4;
        final double actualResult = 3;
        Rental rentedMovie = new ChildrenRentedMovie(new Movie(childrenMovieTitle),daysRented);
        assertEquals(actualResult, rentedMovie.calculateAmount(), DELTA);
    }

    @Test
    public void test_calculateFrequentRentedPoint(){
        final int daysRented = 3;
        final double actualResult = 1;
        Rental rentedMovie = new ChildrenRentedMovie(new Movie(childrenMovieTitle),daysRented);
        assertEquals(actualResult, rentedMovie.calculateFrequentRenterPoints(), DELTA);
    }

}
