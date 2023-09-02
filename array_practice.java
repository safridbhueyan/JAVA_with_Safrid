
package stashpract;

import java.util.Scanner;


public class array_practice {
    public static void main(String[] args) {
        int[][] A = new int[3][4];
        int[][] B = new int[3][4];
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the lists of array A \n");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("A[%d] [%d] = ",i,j);
                A[i][j]= sc.nextInt();
            }
        }
        System.out.println("\n\n\n");
        System.out.println("Enter the lists of array B \n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("B[%d] [%d] = ",i,j);
                B[i][j]= sc.nextInt();
            }
        }
        System.out.println("\n");
        
        System.out.print("A = ");
        for (int i = 0; i < 3; i++) {
       
            for (int j = 0; j < 4; j++) {
                System.out.print("\t "+ A[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("\n\n");
        System.out.print("B = ");
        for (int i = 0; i < 3; i++) {
       
            for (int j = 0; j < 4; j++) {
                System.out.print("\t "+ B[i][j]);
            }
            System.out.println(" ");
        }
      
        System.out.println("\n\n\n");
        
        System.out.print("A + B =\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("  \t "+ (A[i][j] + B[i][j]));
            }
            System.out.println(" ");
        }
 
       
    }
}
