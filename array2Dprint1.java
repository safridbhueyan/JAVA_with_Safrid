
package stashpract;


public class array2Dprint1 {
    public static void main(String[] args) {
        
    
     int[][] A = new int [4][5];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j]= k; 
                k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" "+A[i][j]);
            }
            System.out.println();
        }
}
}
