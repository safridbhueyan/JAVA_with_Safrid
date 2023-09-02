
package stashpract;
/*
      StringBuilder is as same as StringBuffer
*/
public class String_demo5 {
    public static void main(String[] args) {
        StringBuilder SD = new StringBuilder("StringBuilder is same as StringBuffer");
        System.out.println(SD);
         
        SD.append(" bhuiyan ");
        SD.append(469);
        System.out.println("after appending - \n"+SD);
        
        //To reverse a string 
        //We have to use s1.reverse(); methods
        SD.reverse();
        System.out.println("after reversing my name -"+SD);
        
        
        StringBuilder D =new StringBuilder("ladidadida slob on mi nah ");
        System.out.println(D);
        // to delete some string from a point to a certain point
        //We have to use s1.delete(int,int); methods
        D.delete(10, 17);
        System.out.println(D);
       StringBuilder k =new StringBuilder("SHe broke my heart");
        System.out.println(k);
        // To print a String to a certain point or length 
        //We have to use s1.setLength(int); methods
        k.setLength(10);
        System.out.println(k);
        
        
    }
}
