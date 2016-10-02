package org.fundacionjala.movies;

/**
 * Manage the rental movie for a customer
 */
public abstract class Rental {

    protected static final int RENTED_POINT = 1;

    private final Movie movie;
    private double increment;
    private double thisAmount;
    protected double daysLimit;
    protected int daysRented;


    /**
     * Constructor.
     *
     * @param movie      movie to be rented
     * @param daysRented days that a movie is rented
     * @param thisAmount amount to pay for movie
     * @param increment the value that increment the amount of the rental
     * @param limitDays limit days that a rented movie has
   */
    public Rental(Movie movie, int daysRented, double thisAmount, double increment, int limitDays) {
        this.movie = movie;
        this.daysRented = daysRented;
        this.thisAmount = thisAmount;
        this.increment = increment;
        this.daysLimit = limitDays;
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
     * Calculate the amount of the rented movie.
     *
     * @return the calculated amount.
     */
    public double calculateAmount() {
        if (daysRented > daysLimit) {
            thisAmount += (this.daysRented - daysLimit) * this.increment;
        }
        return thisAmount;
    }

    /**
     * Calculate the frequent renter points
     *
     * @return the rented point.
     */
    public int calculateFrequentRenterPoints() {
        return RENTED_POINT;
    }

}