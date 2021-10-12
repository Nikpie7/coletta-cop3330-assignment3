/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nikolai Coletta
 */

package ex43;

import java.io.*;

public class Website {
    private String mySite, myAuthor;
    private boolean myJSS, myCSS;

    public Website(String site, String author, boolean JSS, boolean CSS) {
        mySite = site;
        myAuthor = author;
        myJSS = JSS;
        myCSS = CSS;
    }

    public String getSite() { return mySite; }
    public String getAuthor() { return myAuthor; }
    public boolean getJSS() { return myJSS; }
    public boolean getCSS() { return myCSS; }

    public void generateOutput() throws IOException {
        String path = "src/main/java/ex43/website/";
        new File(path).mkdirs();
        path += mySite;
        new File(path).mkdirs();
        System.out.println("Created " + path);

        FileWriter htmlFile = new FileWriter(path + "/index.html");
        htmlFile.write("<!doctype html>\n");
        htmlFile.write("<head>\n");
        htmlFile.write("    <title>" + mySite + "</title>\n");
        htmlFile.write("    <meta name=\"author\" content=\"" + myAuthor + "\">\n");
        htmlFile.write("</head>\n");
        htmlFile.write("<!doctype html>\n");
        htmlFile.close();
        System.out.println("Created " + path + "/index.html");

        if(myJSS) {
            new File(path + "/js/").mkdirs();
            System.out.println("Created " + path + "/js/");
        }
        if(myCSS) {
            new File(path + "/css/").mkdirs();
            System.out.println("Created " + path + "/css/");
        }

    }
}