package ex41;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void createNameList() throws IOException {
        Scanner inp1 = new Scanner("Smith, John\nFarris, Juan");

        ArrayList<String> outp1 = new ArrayList<String>();
        outp1.add("Farris, Juan");
        outp1.add("Smith, John");

        assertEquals(outp1, App.createNameList(inp1));


        Scanner inp2 = new Scanner("Lee, Dang\nCena, John\nObama, Barack\nColetta, Nikolai");

        ArrayList<String> outp2 = new ArrayList<String>();
        outp2.add("Cena, John");
        outp2.add("Coletta, Nikolai");
        outp2.add("Lee, Dang");
        outp2.add("Obama, Barack");

        assertEquals(outp2, App.createNameList(inp2));
    }

    @Test
    void sortNameList() {
        ArrayList<String> inp1 = new ArrayList<String>();
        inp1.add("Smith, John");
        inp1.add("Farris, Juan");

        ArrayList<String> outp1 = new ArrayList<String>();
        outp1.add("Farris, Juan");
        outp1.add("Smith, John");

        assertEquals(outp1, App.sortNameList(inp1));


        ArrayList<String> inp2 = new ArrayList<String>();
        inp2.add("Lee, Dang");
        inp2.add("Coletta, Nikolai");
        inp2.add("Obama, Barack");
        inp2.add("Cena, John");

        ArrayList<String> outp2 = new ArrayList<String>();
        outp2.add("Cena, John");
        outp2.add("Coletta, Nikolai");
        outp2.add("Lee, Dang");
        outp2.add("Obama, Barack");

        assertEquals(outp2, App.sortNameList(inp2));
    }

    @Test
    void outputNameList() throws IOException {
        ArrayList<String> inp1 = new ArrayList<String>();
        inp1.add("Farris, Juan");
        inp1.add("Smith, John");
        FileWriter fileWrite1 = new FileWriter("src/test/java/ex41/exercise41_output.txt");
        App.outputNameList(inp1, fileWrite1);
        fileWrite1.close();
        Scanner outp1 = new Scanner(new File("src/test/java/ex41/exercise41_output.txt"));

        assertEquals("Total of 2 names", outp1.nextLine());
        assertEquals("-----------------", outp1.nextLine());
        assertEquals("Farris, Juan", outp1.nextLine());
        assertEquals("Smith, John", outp1.nextLine());
    }
}