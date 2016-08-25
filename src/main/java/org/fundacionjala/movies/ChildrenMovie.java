package org.fundacionjala.movies;

/**
 * Created by LuLy on 23/08/2016.
 */
public class ChildrenMovie extends Movie {

    public static final double CHILDRENPRICE = 1.5;

    public ChildrenMovie(String title) {
        super(title);
    }
    @Override
    public double calculateAmount(int daysRented){
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * CHILDRENPRICE;
        return thisAmount;
    }
    @Override
    public int calculateFrequentRenterPoints(int daysRented){
        return 1;
    }
}
