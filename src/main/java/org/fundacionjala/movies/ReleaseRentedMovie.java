package org.fundacionjala.movies;

import java.util.Date;

/**
 * Calculates the total amount and the frequent renter point.
 */
public class ReleaseRentedMovie extends Rental {

    private static final int RELEASEPRICE = 3;
    private static final double INCREMENT = 0;
    private static final int DAYS = 1;

    /**
     * Constructor.
     *
     * @param movie release movie rented
     * @param daysRented days to rent the movie
     */
    public ReleaseRentedMovie(Movie movie, int daysRented) {
        super(movie, daysRented, RELEASEPRICE, INCREMENT, DAYS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount() {
        return this.daysRented * RELEASEPRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints() {
        return (this.daysRented > DAYS) ? (RENTED_POINT + 1) : RENTED_POINT;
    }

}
