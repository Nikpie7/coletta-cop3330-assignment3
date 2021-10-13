/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nikolai Coletta
 */

package ex46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class AppTest {

    @Test
    void createList() {
        Scanner input1 = new Scanner("badger badger badger \n" +
                                          "badger mushroom \n" +
                                          "mushroom snake badger badger \n" +
                                          "badger ");
        ArrayList<StringCounter> output1 = App.createList(input1);

        assertEquals("badger", output1.get(0).getStr());
        assertEquals(7, output1.get(0).getCount());
        assertEquals("mushroom", output1.get(1).getStr());
        assertEquals(2, output1.get(1).getCount());
        assertEquals("snake", output1.get(2).getStr());
        assertEquals(1, output1.get(2).getCount());
    }
}