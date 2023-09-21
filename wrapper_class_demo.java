
package stashpract;
public class wrapper_class_demo {
  /* wrapper class are usually used for
    converting primitive data into object and
    object into primitive data
    
    there are 2 types of conversion 
     1)Autoboxing --> primitive to object
     2)Unboxing --> object to primitive 
    */ 

// Autoboxing
    public static void main(String[] args) {
      int x =32;
    Integer y = Integer.valueOf(x);
    Integer z = x;// automatice will add  Integer.valueOf(x);
    
        System.out.println("value of x is "+x);
        System.out.println("value of y is "+y);
        System.out.println("value of z is "+z);
        System.out.println();
//Unboxing
  Double D = new Double(55.55);
  double c = D.doubleValue();
  double p = D;// automatice will add D.doubleValue();
        System.out.println("value of D is "+D);
        System.out.println("value of c is "+c);
        System.out.println("value of p is "+p);
    }    
  }
