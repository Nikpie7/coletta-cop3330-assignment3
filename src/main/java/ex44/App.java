/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nikolai Coletta
 */

package ex44;

import com.google.gson.Gson;
import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/ex44/exercise44_input.json"));
        Inventory I = gson.fromJson(br, Inventory.class);
        Scanner scan = new Scanner(System.in);

        mainLoop(I.getProducts(), scan);

        br.close();
    }

    public static void mainLoop(Product[] P, Scanner scan)
    {
        System.out.print("What is the product name? ");
        String input = scan.nextLine();
        Product output = searchProduct(P, input);
        if (output == null) {
            System.out.println("Sorry, that product was not found in our inventory.");
            mainLoop(P, scan);
        }
        else
            printProduct(output);
    }

    public static Product searchProduct(Product[] P, String name) {
        for (Product product : P)
            if (product.getName().equalsIgnoreCase(name))
                return product;
        return null;
    }

    public static void printProduct(Product p) {
        System.out.println("Name: " + p.getName());
        System.out.printf("Price: %.2f\n", p.getPrice());
        System.out.println("Quantity: " + p.getQuantity());
    }
}