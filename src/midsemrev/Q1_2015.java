
package midsemrev;

import java.util.Scanner;
public class Q1_2015 {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates X and Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter the move: ");
        String move = sc.next();
        int x1 = x;
        int y1 = y;
        for (int i = 0; i < move.length(); i++) {
            if (move.charAt(i) == 'U') {
                y1++;
            } else if (move.charAt(i) == 'D') {
                y1--;
            } else if (move.charAt(i) == 'L') {
                x1--;
            } else if (move.charAt(i) == 'R') {
                x1++;
            }
        }
        System.out.printf("Initial coordinate (%d,%d)\n", x, y);
        System.out.printf("Final coordinate (%d,%d)\n", x1, y1);
    }
}
