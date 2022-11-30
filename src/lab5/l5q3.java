
package lab5;

import java.util.Random;
import java.util.Scanner;

public class l5q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        int num;
        System.out.print("Enter number of employees: ");
        num = sc.nextInt();
        int[][] hour = new int[num][7];
        for (int i = 0; i < num; i++) {
            int sum = 0;
            System.out.print("Work hours: ");
            for (int j = 0; j < 7; j++) {
                hour[i][j] = rng.nextInt(8) + 1;
                System.out.print(hour[i][j] + " ");
                sum+=hour[i][j];
            }
            System.out.printf("\nTotal hours: %d\n\n", sum);
        }
    }
}
