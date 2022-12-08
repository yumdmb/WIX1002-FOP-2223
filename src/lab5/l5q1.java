    
package lab5;

import java.util.Scanner;
import java.util.Random;

public class l5q1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rdm = new Random();
        int num;
        System.out.print("Enter number of students: ");
        num = keyboard.nextInt();
        int[] score = new int[num];
        int high = 0, low = 100, sum = 0;
        for (int i = 0; i < num; i++) {
            score[i] = rdm.nextInt(101);
            System.out.printf("Student %d score is %d\n", i + 1, score[i]);
            sum+=score[i];
        }
        for (int j = 0; j < num; j++) {
            if (score[j] > high){
                high = score[j];
            }
            if (score[j] < low){
                low = score[j];
            }
        }
        double avg = (double)sum/num;
        System.out.println("\nHighest score: " + high);
        System.out.println("Lowest score: " + low);
        System.out.println("Average score: " + avg);

        keyboard.close();
    }
}