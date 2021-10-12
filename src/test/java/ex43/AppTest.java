/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nikolai Coletta
 */

package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class AppTest {

    @Test
    void getWebsite() {
        Scanner inp1 = new Scanner("awesomeco\nMax Power\ny\ny\n");
        Website expected1 = new Website("awesomeco", "Max Power", true, true);
        Website output1 = App.getWebsite(inp1);

        assertEquals(expected1.getSite(), output1.getSite());
        assertEquals(expected1.getAuthor(), output1.getAuthor());
        assertEquals(expected1.getJSS(), output1.getJSS());
        assertEquals(expected1.getCSS(), output1.getCSS());
    }
}