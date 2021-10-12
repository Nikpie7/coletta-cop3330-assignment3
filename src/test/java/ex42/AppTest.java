package ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class AppTest {

    @Test
    void getPersonArray() {
        Scanner inp1 = new Scanner("Ling,Mai,55900\nJohnson,Jim,56500");
        ArrayList<Person> testOutput1 = new ArrayList<Person>();
        testOutput1.add(new Person("Mai", "Ling", 55900));
        testOutput1.add(new Person("Jim", "Johnson", 56500));

        ArrayList<Person> methodOutput1 = App.getPersonArray(inp1);

        assertEquals(testOutput1.get(0).getFirst(), methodOutput1.get(0).getFirst());
        assertEquals(testOutput1.get(0).getLast(), methodOutput1.get(0).getLast());
        assertEquals(testOutput1.get(0).getSalary(), methodOutput1.get(0).getSalary());
        assertEquals(testOutput1.get(1).getFirst(), methodOutput1.get(1).getFirst());
        assertEquals(testOutput1.get(1).getLast(), methodOutput1.get(1).getLast());
        assertEquals(testOutput1.get(1).getSalary(), methodOutput1.get(1).getSalary());
    }
}