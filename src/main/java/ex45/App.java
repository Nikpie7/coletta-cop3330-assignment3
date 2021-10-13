/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nikolai Coletta
 */

package ex45;

import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        File inFile = new File("src/main/java/ex45/exercise45_input.txt");
        Scanner fileScanner = new Scanner(inFile);
        FileWriter outputWriter = new FileWriter("src/main/java/ex45/" + getFileName(new Scanner(System.in)));

        ArrayList<String> data = replaceUtilize( createList(fileScanner) );
        writeList(outputWriter, data);

        outputWriter.close();
    }

    public static ArrayList<String> createList(Scanner scan) {
        ArrayList<String> output = new ArrayList<>();
        while (scan.hasNextLine())
            output.add(scan.nextLine());
        return output;
    }

    public static String getFileName(Scanner scan) {
        System.out.print("Output file name: ");
        return scan.nextLine();
    }

    public static ArrayList<String> replaceUtilize(ArrayList<String> input) {
        ArrayList<String> output = new ArrayList<>();
        for (String line : input) {
            while (line.contains("utilize"))
                line = line.replace("utilize", "use");
            output.add(line);
        }
        return output;
    }

    public static void writeList(FileWriter output, ArrayList<String> text) throws IOException {
        for(String line : text)
            output.write(line + "\n");
    }
}