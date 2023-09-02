package stashpract;
public class String_demo1 {
    public static void main(String[] args) {
        String s1 ="safrid";
        String s2 = new String("safrid");
        char[] s3 = {'s','a','f','r','i','d'};
        
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        System.out.println(s3);
        int len = s1.length();
        int pi = s2.length();
        System.out.println("s1 is = "+len);
        System.out.println("s2 is = "+pi);
        
        // To compare two strings in java 
        // we cant use s1==s2 (bcz it compares the obj not the value)
        // so we have to use (s1.equals(s2)) function
        
        if(s1.equals(s2)){
            System.out.println("Both are Equals");
        }
        else{
            System.out.println("Not Equals");}
    
    /*To check if certain words are in some string or not
    or two strings contains certain eliments or not 
    for that we have to use 
    s1.contains(s2) or s1.contains("certain words or string elmnts")
    */
    boolean check = s1.contains(s2);
        System.out.println(check);
    if(s1.contains("saf")){
            System.out.println("yes it does contain the word");
    }
    else{
        System.out.println("nope");
    }
    // To compare Strings without concerning about uppercase and lowercase
    if(s1.equalsIgnoreCase(s2)){
            System.out.println("Both are in same Equal Case ");
        }
        else{
            System.out.println("Not Equals in case");}
    
    // TO check if a string is empy or not !!!
    boolean check2 =s1.isEmpty();
        System.out.printf("Is it empty true or false ?\n%b\n",check2);
        
    }
}
