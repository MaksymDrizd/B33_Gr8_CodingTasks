package Audra.week09_solutions;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveNameAhmed {

    /*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {

        // create list of names
        List<String> names = new ArrayList<String>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");

        System.out.println("Original list of names: " + names);

        // using predicate (boolean) it check the object and remove name
        names.removeIf(n -> n.equals("Ahmed"));

        System.out.println("New list of names: " + names);
    }









}
