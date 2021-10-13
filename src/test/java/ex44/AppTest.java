/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nikolai Coletta
 */

package ex44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void searchProduct() {
        Product[] products = new Product[2];

        products[0] = new Product();
        products[0].setName("Broomstick");
        products[0].setPrice(15.00);
        products[0].setQuantity(5);
        products[1] = new Product();
        products[1].setName("Hat");
        products[1].setPrice(25.00);
        products[1].setQuantity(15);

        Product search = App.searchProduct(products, "Hat");

        assertEquals("Hat", search.getName());
        assertEquals(25.00, search.getPrice());
        assertEquals(15, search.getQuantity());
    }
}