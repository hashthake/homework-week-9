package homeworkweek9;

import java.util.HashMap;
import java.util.Map;

/**
 *  Create a HashMap object called people that will store String keys and Integer
 *  values: And use for each loop to iterate the value from Map.
 */

public class Program9HashMapMethod {

    public static void main(String[] args) {


        Map<Integer, String> people = new HashMap<>();

        people.put(1,"Hardik");
        people.put(2,"Ronaldo");
        people.put(3,"Lalit");
        people.put(4,"Sanket");
        people.put(5,"Purvi");
        people.put(6,"Shital");



        // getKey() and getValue() methods to print names and associated numbers
        for(Map.Entry<Integer, String > names: people.entrySet()){
            System.out.println(names.getKey()+", "+names.getValue());
        }
    }
}
