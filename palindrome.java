package stashpract;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        s1=sc.nextLine();
        StringBuffer sb = new StringBuffer(s1);
        
        s2 = sb.reverse().toString(); // toStoring() is use to convert a buffer value as a String value !!!!
        if(s1.equals(s2)){
            System.out.println("pelindrome");
        }
        else{
            System.out.println("Not pelindrome");
        }
    }
}
