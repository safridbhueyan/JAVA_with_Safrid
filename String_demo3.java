
package stashpract;
import java.util.*;

public class String_demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String logic ="HI mY NAme iS dAsH";
        // how to take char as input or to declear
        // char variable name = (input string name).charAt(0);
        char aim = logic.charAt(0);
        System.out.println("first latter of the String is = "+aim);
        
        //TO print a ASCII value of any string index value
        //WE have to use s1.codePointAt(index number);
        int ascii = logic.codePointAt(11);
        System.out.println("The ASCII value is - "+ascii);
        

        //To find a certain String char index value
        // We have to use s1.IndexOf("the letter we looking for");
        int position = logic.indexOf("m");
        System.out.println("the m is in position of "+position);
        // To find same value of any similer string word from last
        //we have to use s1.lastIndexOf("value");
        int lastpos = logic.lastIndexOf("m");
        System.out.println("the last m is in position of "+lastpos);
        
        int pos = logic.indexOf("NAme");
        System.out.println("the NAme is in position of "+pos);
        
        
        
        // to remove extra space from a String
        // we have to use s1.trim(); methods
        String damn = "   my name is Bruce wayne   ";
        String s3 =damn.trim();
        System.out.println(damn);    
        System.out.println(s3);
        
        
        //TO replace something with any letter
        //We have to use s1.replace("the letter to replace","with the one to replace");
        // use s1.replace(char , char); one
        String s2= logic.replace("NAme","lame");
        System.out.println("after replacing -\n"+s2);
        
        
        //TO split some String into Stringor char array
        //We have to use s1.split("the prameter to spit with");
        // Use for loop to print the value
        // here i split it with " "[space] perameter !!!!
        String[] s1 = logic.split(" ");
        for(String x: s1){
            System.out.println(x);
        }
        
        
        
        
        
        
        
        // Scanner input method char s1 = sc.next().charAt(0);
        System.out.print("Enter a character - ");
        char aim2= sc.next().charAt(0);
        System.out.println("output is - "+aim2);
        
        
    }
}
