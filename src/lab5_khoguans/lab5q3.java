
package lab5_khoguans;

import java.util.*;

public class lab5q3 {
    public static void main(String[] args) {
         final int MAX = 8;
        int N = 0;
        Random r = new Random();
        int[][] work;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter N employees: ");
        N = keyboard.nextInt();
        work = new int[N][7];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 7; j++) {
                work[i][j] = 1 + r.nextInt(MAX);
                
            }
        }

        System.out.println("              Su  Mo  Tu  We  Th  Fr  Sa ");
        for (int i = 0; i < work.length; i++) {
            System.out.print("Employee " + i + " ");
            for (int j = 0; j < 7; j++) {
                System.out.printf("%4d", work[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Total Work Hours");

        for (int i = 0; i < work.length; i++) {
            System.out.print("Employee " + i + " : ");
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                sum += work[i][j];
            }
            System.out.println(sum);
        }
    keyboard.close();    
    }
    
}
