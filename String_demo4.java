package stashpract;
/*
why to use StringBuffer rather then using actual Strings ?
1) we cannot change a String value without creating an objects like this -
    String D1 = s1.compare();
2)we can easily change a String value in StringBuffer without creating
  any objects and so on !
3)StringBuffer is easy to use and modify .
4)we can easily append a StringBuffer String.
5) To create a Buffer String we have to follow this methods -
     StringBuffer s1 = new StringBuffer("values");
               System.out.println(s1);

*/
public class String_demo4 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("safrid");
        
        System.out.println(s1);
        s1.append(" bhuiyan ");
        s1.append(469);
        System.out.println("after appending - \n"+s1);
        
        //To reverse a string 
        //We have to use s1.reverse(); methods
        s1.reverse();
        System.out.println("after reversing my name -"+s1);
        
        
        StringBuffer D =new StringBuffer("ladidadida slob on mi nah ");
        System.out.println(D);
        // to delete some string from a point to a certain point
        //We have to use s1.delete(int,int); methods
        D.delete(3, 17);
        System.out.println(D);
        StringBuffer k =new StringBuffer("SHe broke my heart");
        System.out.println(k);
        // To print a String to a certain point or length 
        //We have to use s1.setLength(int); methods
        k.setLength(10);
        System.out.println(k);
        
        // we can initialize a String to bufferString like this -
        String killer = " jeffery lame";
        StringBuffer larry = new StringBuffer(killer);
        System.out.println(larry);
    }
}
