package org.fundacionjala.movies;

/**
 * Class to calculate the total amount and the frequent point.
 */
public class ChildrenMovie extends Movie {

    private static final double CHILDRENPRICE = 1.5;

    private static final int DAYS = 3;

    /**
     * Constructor
     *
     * @param title of the movie
     */
    public ChildrenMovie(String title) {
        super(title);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateAmount(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > DAYS)
            thisAmount += (daysRented - DAYS) * CHILDRENPRICE;
        return thisAmount;
    }

}
