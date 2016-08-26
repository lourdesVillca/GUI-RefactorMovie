package org.fundacionjala.movies;

/**
 * Manage information of movies.
 */
public abstract class Movie {

    private static final int RENTED_POINT = 1;

    private String title;

    /**
     * Initialize the values of the Movie.
     *
     * @param title of the movie.
     */
    public Movie(String title) {
        this.title = title;
    }

    /**
     * Get the title of the movie.
     *
     * @return the name of the movie.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Calculate the amount of the movie.
     *
     * @param daysRented days that a movie is rented
     * @return the calculated amount.
     */
    public abstract double calculateAmount(int daysRented);

    /**
     * Calculate the frequent points
     *
     * @param daysRented days that ba movie is rented.
     * @return the rented point.
     */
    public int calculateFrequentRenterPoints(int daysRented) {
        return RENTED_POINT;
    }

}
