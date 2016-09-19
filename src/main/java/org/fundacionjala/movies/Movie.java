package org.fundacionjala.movies;

/**
 * Manage information of movies.
 */
public class Movie {

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

}
