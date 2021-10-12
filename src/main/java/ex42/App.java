/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nikolai Coletta
 */

package ex42;

import java.io.*;
import java.util.*;

public class App {
    //main simply creates file reading functions and calls other App methods
    public static void main(String[] args) throws IOException {
        File inFile = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner s = new Scanner(inFile);

        printPersonArray( getPersonArray(s) );
    }

    //takes in a scanner and properly stores all values of the scanner to Person objects in an ArrayList
    public static ArrayList<Person> getPersonArray(Scanner scan) {
        ArrayList<Person> output = new ArrayList<Person>();
        String line, tempFirst, tempLast;
        int tempSalary;

        while(scan.hasNextLine())
        {
            line = scan.nextLine();
            tempLast = line.substring(0, line.indexOf(","));
            line = line.substring(line.indexOf(",") + 1);
            tempFirst = line.substring(0, line.indexOf(","));
            tempSalary = Integer.parseInt(line.substring(line.indexOf(",") + 1));
            output.add(new Person(tempFirst, tempLast, tempSalary));
        }

        return output;
    }

    //prints all Person objects in a table
    public static void printPersonArray(ArrayList<Person> P) {
        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");
        for(Person i : P)
            System.out.printf("%-10s%-10s%-6d\n", i.getLast(), i.getFirst(), i.getSalary());
    }
}
