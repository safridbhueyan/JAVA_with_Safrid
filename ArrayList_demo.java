
package stashpract;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class ArrayList_demo {
    public static void main(String[] args) {
  
        ArrayList<Integer> A  = new ArrayList<>();
        A.add(20);
        A.add(45);
        A.add(25);
        A.add(45);
        A.add(26);
        A.add(89);
        System.out.println("Array size = "+A.size());
        // normal way to print arraylist
        System.out.println("ArrayList = "+A);
       
       /* for (int i: A) {
            System.out.print(i+" ");  // For each way to print Arraylist
        }
        */
       // iterator way of printing arraylist
      /* Iterator itr = A.iterator();
       while(itr.hasNext()){
           System.out.print(itr.next()+" "); } */
     // Removing from ArrayList 
     // A.remove(2);
       System.out.println("After removing from ArrayList = "+A);
       // A.removeAll(A);
        //System.out.println("after removing all = "+A);
        
        
       // A.clear();
        boolean check = A.isEmpty();
        System.out.println("The ArrayList is Empty : "+ check);
        
        // to find certain value in arraylist we have to use
        // variable_name.contain() method;
        boolean cont = A.contains(25);
        System.out.println("the value is preasent : "+ cont );
        
        //to check index we have to use Name.indexof(); method
        int pos= A.indexOf(89);
        System.out.println("the postion in indx is : "+pos );
        
        //replacing array value with name.set(); methods
        A.set(2,69);// replacing
        System.out.println("after seting new ArrayList :"+ A);
        
        // getting output with name.get() methods
        int I= A.get(3);
        System.out.println("the value of index 3 is :"+I);
        
    }
}
