package homeworkweek9;

import java.util.HashSet;
import java.util.Set;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
 * and if else)
 */

public class Program8HashsetIntegerObject {

    public static void main(String[] args) {


        Set<Integer> store = new HashSet<Integer>();

        store.add(4);
        store.add(7);
        store.add(8);


        for(int i = 1;i<=10;i++){

            if(store.contains(i)){
                System.out.println(i+" is on the set");
            } else{
                System.out.println(i+" is not on the set");
            }

        }
    }
}

