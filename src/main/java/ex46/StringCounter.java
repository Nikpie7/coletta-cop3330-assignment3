/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nikolai Coletta
 */

package ex46;

public class StringCounter {
    private String str;
    private int count;

    public StringCounter(String str) {
        this.str = str;
        count = 1;
    }

    public String getStr() { return str; }
    public int getCount() { return count; }
    public void setStr(String str) { this.str = str; }
    public void setCount(int count) { this.count = count; }
}