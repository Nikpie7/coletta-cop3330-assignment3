/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nikolai Coletta
 */

package ex46;

import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        File inFile = new File("src/main/java/ex46/exercise46_input.txt");
        Scanner scan = new Scanner(inFile);

        printFrequencies(createList(scan));
    }

    public static ArrayList<StringCounter> createList(Scanner scan) {
        ArrayList<StringCounter> output = new ArrayList<StringCounter>();
        String value;

        while (scan.hasNext()) {
            value = scan.next();
            for (StringCounter s : output)
                if(s.getStr().equalsIgnoreCase(value))
                {
                    s.setCount(s.getCount() + 1);
                    value = null;
                    break;
                }
            if (value != null)
                output.add(new StringCounter(value));
        }
        return output;
    }

    public static void printFrequencies(ArrayList<StringCounter> strList)
    {
        int maxIndex;
        while (strList.size() > 0) {
            maxIndex = 0;
            for(int i = 1; i < strList.size(); i++) {
                if (strList.get(maxIndex).getCount() < strList.get(i).getCount())
                    maxIndex = i;
            }
            System.out.printf("%-10s", strList.get(maxIndex).getStr() + ":");
            printStars(strList.get(maxIndex).getCount());
            System.out.println();
            strList.remove(maxIndex);
        }
    }

    public static void printStars(int num)
    {
        if (num > 0) {
            System.out.print("*");
            printStars(num - 1);
        }
    }
}