package org.fundacionjala.movies;

/**
 * Created by LuLy on 23/08/2016.
 */
public class ReleaseMovie extends Movie {

    public static final int RELEASEPRICE = 3;

    public ReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double calculateAmount(int daysRented) {
        double thisAmount = daysRented * RELEASEPRICE;
        return thisAmount;
    }

    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
