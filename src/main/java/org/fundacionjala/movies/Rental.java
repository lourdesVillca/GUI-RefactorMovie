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
        return movie.calculateFrequentRenterPoints(daysRented);
    }

    public double calculateAmount() {
        return movie.calculateAmount(daysRented);
    }
}