
package midsemrev;

import java.util.Scanner;
public class Q2_2015 {
  public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double total = 0;
        String type;
        do {
            System.out.print("Enter the type of durian, [Quit] to exit: ");
            type = keyboard.next();
            if (type.equals("Quit")) {
                break;
            }
            System.out.print("Enter the sales in kg: ");
            double sales = keyboard.nextDouble();
            switch (type) {
                case "MK" -> total += sales * 25;
                case "HL" -> total += sales * 22;
                case "D24" -> total += sales * 20;
                case "UM" -> total += sales * 18;
                default -> System.out.println("Invalid type");
            }
        } while (true);
        System.out.printf("Total sales: RM%.2f", total);
        
    keyboard.close();    
    }

}
