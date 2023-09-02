
package stashpract;


public class String_demo2 {
    public static void main(String[] args) {
        
        
        String firstname = "safrid";
        String lastname = " bhuiyan";
        
        // to concat Strings we have to use
        // s1.concat(s2); methods
        
       String fullname = firstname.concat(lastname);
        System.out.println("Fullname = "+fullname);
        
        //to convert into uppercase or lowercase
       //s1.toUpperCase(); or s2.toLowerCase();
       
       String upper = firstname.toUpperCase();
       String lower = firstname.toLowerCase();
       System.out.println(upper+" "+lower);
       
       //To check if a certain string starts or ends with a specific letter or words
      //s1.startsWith("A"); or s2.endsWith("s");
      
      boolean check = firstname.startsWith("saf");
      boolean check2 = lastname.endsWith("yan");
      System.out.println("If its starts and ends with \"saf\" and \"yan\" ? \n"+check+" & "+check2);
        
      // To print String array-
      
      String [] names ={"safrid","lil xan","lil pump","j cole"};
      for(String x: names)
      {
          System.out.println(x); 
      } 
        System.out.println("new way of for loop with indexing");
        // to put index 1) in 0 to s1.lengthSS type for loop
        // we have to use (i+1+")"+s1)
        //Inside the loop, you print the index 
        //(i + 1, to make it 1-based) followed by a ") " and then the value of names[i]. 
        //This loop will print each name along with its position in the array
        for (int i =0; i <4; i++) {
            System.out.println(i+1+")"+names[i]);
        }
 
        
         }
        
}
