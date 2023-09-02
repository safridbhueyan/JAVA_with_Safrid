
package stashpract;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_demo3_asendindesendinSort {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(21);
        A.add(420);
        A.add(69);
        A.add(209);
        A.add(23);
        A.add(11);
        System.out.println("before sorting A = "+A);
        //To sort an ArrayList we have to use colections.sort(Name); methods
        Collections.sort(A);
        System.out.println("After sorting in ascending order A = "+A);
         //To Reverse sort an ArrayList in a descending order
         //we have to use colections.sort(Name,Collection.reverseOrder); methods
        Collections.sort(A,Collections.reverseOrder());
         System.out.println("After sorting in Descending order A = "+A);
        
    }
}
