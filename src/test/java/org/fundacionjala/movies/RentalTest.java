package org.fundacionjala.movies;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by carlos gonzales on 8/23/2016.
 */
public class RentalTest {
    @Test
    public void verifyCalculateFrequentRenterPointsForNewReleaseMovie() {
       String movieTitle = "Independence Day";
       int daysRented = 2;
       Rental rental = new Rental(new ReleaseMovie(movieTitle),daysRented);
       final int actualResult = 2;
       assertEquals(actualResult, rental.calculateFrequentRenterPoints());

    }
    @Test
    public void verifyCalculateFrequentRenterPointsForOtherKindOfMovie() {
        String movieTitle = "Independence Day";
        int daysRented = 2;
        Rental rental = new Rental(new RegularMovie(movieTitle),daysRented);
        final int actualResult = 1;
        assertEquals(actualResult, rental.calculateFrequentRenterPoints());
    }
    @Test
    public void verifyRentalIsCreated(){
        String movieTitle = "Independence Day";
        int daysRented = 2;
        Rental rental = new Rental(new RegularMovie(movieTitle),daysRented);
        assertNotNull(rental);
    }
}