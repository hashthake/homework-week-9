package homeworkweek9;

import java.util.ArrayList;

/**
 * Write a Java program to test an array list is empty or not. Define array list with
 * underground tube names
 */

public class Program7TestAnArrayList {

    public static void main(String[] args) {


        ArrayList<String> s = new ArrayList<>();

        s.add("Metropolitan line");
        s.add("Bakerloo line");
        s.add("District line");
        s.add("Circle Line");
        s.add("Jubilee line");

        boolean a = true;
        // this if condition will be true if arraylist is empty
        if (!(a != s.isEmpty())) {
            System.out.println("is array list empty");
        } else {
            for (int i = 0; i < s.size(); i++) {
                System.out.println(s.get(i));
            }
        }
    }


}
