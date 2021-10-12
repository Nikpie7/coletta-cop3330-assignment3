package ex42;

public class Person {
    private String firstName, lastName;
    private int salary;

    //constructor takes in three variables all to be stored locally and privately
    public Person(String first, String last, int sal)
    {
        firstName = first;
        lastName = last;
        salary = sal;
    }

    //the following three functions are getter functions for accessing the private variables for an instance

    String getFirst()
    {
        return firstName;
    }

    String getLast()
    {
        return lastName;
    }

    int getSalary()
    {
        return salary;
    }
}
