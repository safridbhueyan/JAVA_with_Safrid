
package stashpract;

import java.util.Scanner;




public class bee1183 {
    public static void main(String[] args) {
         double [][] A= new double [12][12];
        double upperElmnts = 0,count=0;
         Scanner sc = new Scanner(System.in);
       char C =sc.next().charAt(0);
        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 12; col++) {
                A[row][col] = sc.nextDouble();
            }
        }
        for (int row = 0; row < 12; row++) {
            for (int col = 0; col < 12; col++) {
               
               if(row < col){
                 upperElmnts = upperElmnts + A[row][col]; 
              count++;
               }
    }
         }
    if(C =='S'){
        System.out.printf("%0.1f\n",upperElmnts);
    }
    else if(C =='M'){
        System.out.printf("%0.1f\n",(upperElmnts/count) );
    }
    }

}
