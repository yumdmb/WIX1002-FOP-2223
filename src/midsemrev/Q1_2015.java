
package midsemrev;

import java.util.Scanner;
public class Q1_2015 {

 public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //input=3 marks
        System.out.println("Enter the coordinates X and Y: ");
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        System.out.println("Enter the move: ");
        String move = keyboard.nextLine(); // keyboard.nextLine()
        int x1 = x;
        int y1 = y;
        for (int i = 0; i < move.length(); i++) { //loop=2 marks
            if (move.charAt(i) == 'U') {          //if comparsion=3 marks 
                y1++;
            } else if (move.charAt(i) == 'D') {
                y1--;
            } else if (move.charAt(i) == 'L') {
                x1--;
            } else if (move.charAt(i) == 'R') {
                x1++;
            }
        }
        System.out.printf("Initial coordinate (%d,%d)\n", x, y); //output=1 mark System.out.printIn("Initial Coordnate(" + x + "," + y +")");
        System.out.printf("Final coordinate (%d,%d)\n", x1, y1); //output=1 mark System.out.printIn("FInal Coordinate (" + x + "," + y + ")");
    keyboard.close();    
    }
}
