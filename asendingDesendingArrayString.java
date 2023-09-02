
package stashpract;

import java.util.Arrays;

public class asendingDesendingArrayString {
    public static void main(String[] args) {
        int[] A={2,3,7,5,8};
        Arrays.sort(A);
        System.out.print("Ascending = ");
        
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        
        System.out.print("Descending = ");
        for (int i = 4; i >=0; i--) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        
        String[] B ={"safrid","juicewrld","jcole","drake"};
        Arrays.sort(B);
         System.out.print("Ascending = ");
        for (int i = 0; i < 4; i++) {
            System.out.print(B[i]+" ");
        }
        System.out.println();
        
          System.out.print("Descending = ");
        for (int i = 3; i >=0; i--) {
            System.out.print(B[i]+" ");
        }
        
        
    }
}
