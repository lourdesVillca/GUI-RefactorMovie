package org.fundacionjala.movies;

/**
 * Manage the rental movie for a customer
 */
public class Rental {

    private final Movie movie;

    private final int daysRented;

    /**
     * Constructor.
     *
     * @param movie movie to be rented
     * @param daysRented days that a movie is rented
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * Get the days that a movie was rented
     *
     * @return the rented days
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Get the rented movie.
     *
     * @return the movie.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * Calculate the frequent rented point.
     *
     * @return the calculated frequent renter points.
     */
    public int calculateFrequentRenterPoints() {
        return movie.calculateFrequentRenterPoints(daysRented);
    }

    /**
     * Calculate the amount for movie.
     *
     * @return the calculated amount for a movie.
     */
    public double calculateAmount() {
        return movie.calculateAmount(daysRented);
    }
}