
package lab5_khoguans;

import  java.util.*;
public class lab5q6 {
    public static void main(String[] args) {
        int row;
        // String input;
        // boolean status = false;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        row = keyboard.nextInt();
        // input = keyboard.nextLine();
        keyboard.close();
        int[][] triangle = new int[row][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (j == 0) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = 0;
                }
            }
        }
        
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < row; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        System.out.println("The Pascal Triangle with " + row + " row(s)");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(triangle[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
