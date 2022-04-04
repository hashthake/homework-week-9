package homeworkweek9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */

public class Program5IterateElements {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("BMW");
        set.add("Audi");
        set.add("Honda");
        set.add("Tesla");
        set.add("Toyota");


        Iterator i = set.iterator();

        while (i.hasNext()) {

            System.out.println(i.next());
        }

    }
}