package org.fundacionjala.movies;

/**
 * Created by LuLy on 23/08/2016.
 */
public class ReleaseMovie extends Movie{

    public static final int RELEASEPRICE = 3;

    public ReleaseMovie(String title) {
        super(title);
    }
    public double calculateAmount(int daysRented){
        double thisAmount = daysRented * RELEASEPRICE;
        return thisAmount;
    }
}
