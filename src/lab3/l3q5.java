
package lab3;

import java.util.Scanner;

public class l3q5{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a, b, c, d, e, f, x, y;
        
        System.out.print("Input a: ");
        a = keyboard.nextDouble();
        System.out.println();
        System.out.print("Input b: ");
        b = keyboard.nextDouble();
        System.out.println();
        System.out.print("Input c: ");
        c = keyboard.nextDouble();
        System.out.println();
        System.out.print("Input d: ");
        d = keyboard.nextDouble();
        System.out.println();
        System.out.print("Input e: ");
        e = keyboard.nextDouble();
        System.out.println();
        System.out.print("Input f: ");
        f = keyboard.nextDouble();
        System.out.println();
        keyboard.close();
        
        if (((a*d)-(b*c)) == 0){
            System.out.println("The equation has no solution");
        } else {
            x = ((e*d)-(b*f))/((a*d)-(b*c));
            y = ((a*f)-(e*c))/((a*d)-(b*c));
            System.out.printf("x: %.2f\ny: %.2f\n",x, y);  
        }
    }
}




