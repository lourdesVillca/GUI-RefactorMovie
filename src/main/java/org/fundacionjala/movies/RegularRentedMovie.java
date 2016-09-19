package org.fundacionjala.movies;

/**
 * Define the default values for Regular movies rented
 */
public class RegularRentedMovie extends Rental {

    private static final double REGULARPRICE = 2;
    private static final double INCREMENT = 1.5;
    private static final int DAYS = 2;

    /**
     * Constructor that call the super class with the parameters of the Regular Rented Movie
     *
     * @param movie      Regular movie to be rented
     * @param daysRented days to rent the movie
     */
    public RegularRentedMovie(Movie movie, int daysRented) {
        super(movie, daysRented, REGULARPRICE, INCREMENT, DAYS);
    }

}
