package lab5;

import java.util.Scanner;

public class l5q4_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int arr[][] = new int [3][3];
        
        System.out.println("Please input a 3 by 3 matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Matrix[" + i + "][" + j + "]: ");
                arr[i][j]=keyboard.nextInt();
            }
        }
        System.out.println();
        
        System.out.println("3 by 3 Matrix");
        for(int i=0; i<3 ; i++){
            for(int j=0, k=1; j<3 ; j++, k++){
                System.out.printf("%-3d", arr[i][j]);
                if(k%3 ==0){
                    System.out.println();
                }
            }
        }
        
        
        //rotates 90 degrees clockwise
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = arr[2-j][i];
            }
        }
        
        System.out.println("After rotates 90 degress clockwise");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
   keyboard.close();     
   }
    
}