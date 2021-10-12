/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nikolai Coletta
 */

package ex43;

import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        Website myWebsite = getWebsite(s);
        myWebsite.generateOutput();
    }

    static Website getWebsite(Scanner scan) {
        String site, author, temp;
        boolean JSS, CSS;

        System.out.print("Site name: ");
        site = scan.nextLine();

        System.out.print("Author: ");
        author = scan.nextLine();

        System.out.print("Do you want a folder for JavaScript? ");
        temp = scan.nextLine();
        if(temp.equalsIgnoreCase("y"))
            JSS = true;
        else
            JSS = false;

        System.out.print("Do you want a folder for CSS? ");
        temp = scan.nextLine();
        if(temp.equalsIgnoreCase("y"))
            CSS = true;
        else
            CSS = false;

        return new Website(site, author, JSS, CSS);
    }
}
