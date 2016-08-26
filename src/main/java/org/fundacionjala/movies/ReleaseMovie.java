package org.fundacionjala.movies;

/**
 * Calculates the total amount and the frequent renter point.
 */
public class ReleaseMovie extends Movie {

    private static final int RELEASEPRICE = 3;

    private static final int DAYS = 1;

    /**
     * Constructor.
     *
     * @param title of the release movie.
     */
    public ReleaseMovie(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(int daysRented) {
        double thisAmount = daysRented * RELEASEPRICE;
        return thisAmount;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > DAYS) ? 2 : 1;
    }

}
