package org.fundacionjala.movies;

import java.util.LinkedList;
import java.util.List;

/**
 * Manage the Rental of movies for a customer
 */
public class ManageRental {

    private static final String BREAK_LINE = "\n";

    private static final String TAB = "\t";

    private Customer customer;

    private List<Rental> rentals;

    /**
     * Constructor.
     *
     * @param customer customer for the rental
     */
    public ManageRental(Customer customer) {
        this.customer = customer;
        rentals = new LinkedList<Rental>();;
    }

    /**
     * Method that adds rental to the list.
     *
     * @param rental the rental to be added
     */
    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    /**
     * Method to calculate the total Frequent renter points.
     */
    public int calculateTotalFrequentRenterPoints() {
        return rentals.stream()
                .mapToInt(Rental::calculateFrequentRenterPoints).sum();
    }

    /**
     * Method to calculate the total amount.
     *
     * @return the calculated total amount.
     */
    public double calculateTotalAmount() {
        return rentals.stream()
                .mapToDouble(Rental::calculateAmount).sum();
    }

    /**
     * Method that builds the result.
     *
     * @return the statement with the result.
     */
    public String statement() {
        StringBuilder result = new StringBuilder();
        result.append("Rental Record for ");
        result.append(customer.getName());
        result.append(BREAK_LINE);
        for (Rental rental : rentals) {
            //show figures for this rental
            result.append(TAB);
            result.append(rental.getMovie().getTitle());
            result.append(TAB);
            result.append(rental.calculateAmount());
            result.append(BREAK_LINE);
        }
        //add footer lines
        result.append("Amount owed is ");
        result.append(calculateTotalAmount());
        result.append(BREAK_LINE);
        result.append("You earned ");
        result.append(calculateTotalFrequentRenterPoints());
        result.append(" frequent renter points");
        return result.toString();
    }



}
