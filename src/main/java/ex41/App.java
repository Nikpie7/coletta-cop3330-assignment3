/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nikolai Coletta
 */

package ex41;

import java.io.*;
import java.util.*;

public class App {
    //main creates local variables and runs the other functions
    public static void main(String[] args) throws IOException {
        File inFile = new File("src/main/java/ex41/exercise41_input.txt");
        FileWriter fileWrite = new FileWriter("src/main/java/ex41/exercise41_output.txt");

        //creates the arraylist from the input file, and sorts it
        ArrayList<String> nameList = createNameList(new Scanner(inFile));
        //prints the output to a text file
        outputNameList(nameList, fileWrite);

        fileWrite.close();
    }

    //creates a name list from all lines in the scanner, and runs sortNameList to sort
    public static ArrayList<String> createNameList(Scanner scan) throws IOException
    {
        ArrayList<String> output = new ArrayList<String>();
        while(scan.hasNextLine())
            output.add(scan.nextLine());
        return sortNameList(output);
    }

    //sorts the given arraylist
    public static ArrayList<String> sortNameList(ArrayList<String> arr)
    {
        Collections.sort(arr);
        return arr;
    }

    //prints the name list to the file given with myFile
    public static void outputNameList(ArrayList<String> arr, FileWriter myFile) throws IOException
    {
        myFile.write("Total of " + arr.size() + " names\n");
        myFile.write("-----------------\n");
        for (String name : arr)
            myFile.write(name + "\n");
    }
}