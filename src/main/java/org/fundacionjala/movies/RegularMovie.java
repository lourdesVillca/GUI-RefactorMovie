package org.fundacionjala.movies;

/**
 * Calculate the total amount for a Regular movie.
 */
public class RegularMovie extends Movie {

    private static final double REGULARPRICE = 1.5;

    private static final int DAYS = 2;

    /**
     * Constructor
     *
     * @param title the title of the movie.
     */
    public RegularMovie(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(int daysRented) {
        double thisAmount = 2;
        if (daysRented > DAYS)
            thisAmount += (daysRented - DAYS) * REGULARPRICE;
        return thisAmount;
    }

}
