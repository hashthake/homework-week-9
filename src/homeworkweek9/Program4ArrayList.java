package homeworkweek9;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */

public class Program4ArrayList {

    public static void main(String[] args) {

        ArrayList<String> colour = new ArrayList<>();

        colour.add("White");
        colour.add("Black");
        colour.add("Red");
        colour.add("Orange");
        colour.add("Brown");

        //for loop to print arraylist
        for (int i = 0; i < colour.size(); i++) {
            System.out.println(colour.get(i));
        }
    }
}
