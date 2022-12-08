
package lab3;

import java.util.Scanner;
import java.lang.Math;

public class l3q6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = keyboard.nextDouble();
        System.out.print("Enter x,y coordinates of a point by entering 2 numbers separated by space: ");
        double x = keyboard.nextDouble();
        double y = keyboard.nextDouble();
        keyboard.close();
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (distance <= radius) {
            System.out.printf("Point (%.2f, %.2f) is inside the circle.", x, y);
        } else {
            System.out.printf("Point (%.2f, %.2f) is outside the circle.", x, y);
        }
    }
}


