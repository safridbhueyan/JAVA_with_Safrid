
package stashpract;

import java.util.Scanner;

public class diagnal_upper_lowerElements {
    public static void main(String[] args) {
        int [][] A= new int [3][4];
        int diagnalEmnts = 0;
        int upperElmnts = 0;
        int lowerElmnts = 0;
        System.out.println("Enter the elements : ");
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                A[row][col] = sc.nextInt();
            }
        }
        
        // row == column hoile diagonal
        //column > row er the boro hoile upper tringle er jog
        //column < row er the boro hoile lower tringle er jog
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
               if(row==col){
                   diagnalEmnts= diagnalEmnts + A[row] [col];
               }
               if(row < col){
                 upperElmnts = upperElmnts + A[row][col]; 
               }
               if(row>col){
                  lowerElmnts = lowerElmnts + A[row][col]; 
               }
            }
        }
        
        System.out.println("diagonel sum is : "+ diagnalEmnts );
        System.out.println("upper Elements sum is : "+ upperElmnts );
        System.out.println("lower Elements sum is : "+ lowerElmnts );
    }
    
}
