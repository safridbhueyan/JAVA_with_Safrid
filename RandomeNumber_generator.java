
package stashpract;
/*
if we want to start from a certain number 
then we have to add that number 
to finish on  certain number add 1 to it
coz number count starts with 0 to that number
*/
import java.util.Random;

public class RandomeNumber_generator {
    public static void main(String[] args) {
        Random RKO = new Random();
        int Random_number = RKO.nextInt(10)+1;        
        System.out.println("your number is "+Random_number);
        
        int rand = (int)(Math.random()*10)+1;
        System.out.println("your number is "+rand);
        
    }
}
