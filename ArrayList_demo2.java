
package stashpract;

import java.util.ArrayList;


public class ArrayList_demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        
        A.add(20);
        A.add(30);
        A.add(28);
        A.add(82);
        A.add(43);
        A.add(52);
        System.out.println("A = "+A);
        B.add(28);
        B.add(31);
        B.add(69);
        B.add(66);
        B.add(33);
        B.add(51);
        System.out.println("B = "+B);
        
        // to set the same value of array into another array list 
       // we have to use name.addAll(); methods 
       C.addAll(A);
        System.out.println("C = "+C);
        
        //To check if two arrayList is same or not
       //we have to use Nmae.equals(Name2); methods 
       boolean check = A.equals(B);
        System.out.println("A is equal to B : "+ check);
        check = A.equals(C);
        System.out.println("A is equal to C : "+ check);
        
        
    }
}
