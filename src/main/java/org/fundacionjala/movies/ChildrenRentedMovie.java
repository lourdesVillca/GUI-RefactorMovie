package org.fundacionjala.movies;

/**
 * Class to calculate the total amount and the frequent point.
 */
public class ChildrenRentedMovie extends Rental {

    private static final double CHILDRENPRICE = 1.5;
    private static final double INCREMENT = 1.5;
    private static final int DAYS = 3;

    /**
     * Constructor.
     *
     * @param movie Children movie rented.
     * @param daysRented days to rent the movie.
     */
    public ChildrenRentedMovie(Movie movie, int daysRented) {
        super(movie, daysRented, CHILDRENPRICE, INCREMENT, DAYS);
    }

}
