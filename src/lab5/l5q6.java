
package lab5;

import java.util.Scanner;

public class l5q6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of rows of Pascal Triangle: ");
        int n = keyboard.nextInt();
        System.out.println("The Pascal Triangle with " +n+ " row(s):\n");
        int[][] pascal = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    pascal[i][j] = 1;
                }else{
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}


 