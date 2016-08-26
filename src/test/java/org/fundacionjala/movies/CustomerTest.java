package org.fundacionjala.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Customer}
 */
public class CustomerTest {

    @Test
    public void test_rentalIsCreated() {
        String name = "Lourdes";
        Customer customer = new Customer(name);
        assertEquals(name,customer.getName());
    }

}
