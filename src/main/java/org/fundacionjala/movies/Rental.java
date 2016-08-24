package org.fundacionjala.movies;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int calculateFrequentRenterPoints() {
        int frequentRenterPoints = 1;
        // add bonus for a two day new release rental
        if ((getMovie() instanceof ReleaseMovie) && getDaysRented() > 1)
             frequentRenterPoints++;
        return frequentRenterPoints;
    }

    public double calculateAmount() {
        return movie.calculateAmount(getDaysRented());
    }
}