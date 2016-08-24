package org.fundacionjala.movies;

/**
 * Created by LuLy on 23/08/2016.
 */
public class RegularMovie extends Movie{

    public static final double REGULARPRICE = 1.5;

    public RegularMovie(String title) {
        super(title);
    }
    public double calculateAmount(int daysRented){
       double thisAmount = 2;
        if (daysRented > 2)
            thisAmount += (daysRented - 2) * REGULARPRICE;
        return thisAmount;
    }

}
