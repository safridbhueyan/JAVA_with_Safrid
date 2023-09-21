
package stashpract;
/*
conversion between String data type and primitive data type
*/

public class String_demo6 {
    public static void main(String[] args) {
       
        // primitive to String
        int x = 1050;
        String y = Integer.toString(x);
        System.out.println("int to String is "+y);
        double p = 10.50;
        String k = Double.toString(p);
        System.out.println("int to String is "+k);
        
        //string to primitive 
      String D ="5565";
      int G = Integer.parseInt(D);
        System.out.println("String to int is "+G);
      String A ="55";
      double T = Double.parseDouble(A);
        System.out.println("String to int is "+T);
        
        String v ="536";
        int S = Integer.valueOf(v);
        System.out.println("String to int is "+S);
    }
}
