/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nikolai Coletta
 */

package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class AppTest {

    @Test
    void createList() {
        Scanner input1 = new Scanner("Hello everyone! I hope\nyou are doing well!");
        ArrayList<String> output1 = App.createList(input1);
        ArrayList<String> compare1 = new ArrayList<>();
        compare1.add("Hello everyone! I hope");
        compare1.add("you are doing well!");

        assertEquals(compare1.get(0), output1.get(0));
        assertEquals(compare1.get(1), output1.get(1));
    }

    @Test
    void getFileName() {
        Scanner input1 = new Scanner("out.txt");
        assertEquals("out.txt", App.getFileName(input1));
    }

    @Test
    void replaceUtilize() {
        ArrayList<String> input1 = new ArrayList<>();
        input1.add("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.");
        input1.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
        input1.add("utilizes an IDE to write her Java programs\".");
        input1 = App.replaceUtilize(input1);

        ArrayList<String> compare1 = new ArrayList<>();
        compare1.add("One should never use the word \"use\" in writing. Use \"use\" instead.");
        compare1.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
        compare1.add("uses an IDE to write her Java programs\".");

        assertEquals(compare1.get(0), input1.get(0));
        assertEquals(compare1.get(1), input1.get(1));
        assertEquals(compare1.get(2), input1.get(2));
    }
}