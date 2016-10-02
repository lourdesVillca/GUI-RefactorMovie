package org.fundacionjala.movies;

/**
 * Manage customer information.
 */
public class Customer {

    private final String name;

    /**
     * Constructor.
     *
     * @param name of the Customer
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * Method that returns the name of the customer.
     *
     * @return the name of the customer.
     */
    public String getName() {
        return name;
    }

}
