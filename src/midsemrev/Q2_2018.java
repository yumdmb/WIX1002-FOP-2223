
package midsemrev;

import java.util.Scanner;
public class Q2_2018 {
    
 public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num, factor;
        boolean ans, x;
        int ques=0, corr=0;
        do {
            System.out.print("Enter a number (-1 to quit): ");
            num = keyboard.nextInt();
            if (num == -1) {
                break;
            }
            ques++;

            System.out.print("Enter a factor: ");
            factor = keyboard.nextInt();

            System.out.printf("%d is a factor of %d? (true/false): ", factor, num);
            ans = keyboard.nextBoolean();
            
            x = num % factor == 0;
            if (ans == x) {
                System.out.print("Your answer is correct\n");
                corr++;
            } else {
                System.out.print("Your answer is incorrect\n");
            }
        }
        while (true);
        System.out.printf("The final score is: %d/%d", corr, ques);
    keyboard.close();    
    }
}
