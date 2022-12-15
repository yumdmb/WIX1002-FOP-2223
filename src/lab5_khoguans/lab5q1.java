
package lab5_khoguans;

import java.util.*;

public class lab5q1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter N students: ");
        int N = keyboard.nextInt();
        int[] score = new int[N];
        for(int i=0;i<N;i++){
            score[i] = rand.nextInt(101);
        }
        
        int low = score[0];
        int sum = score[0];
        int high = score[0];
        System.out.print("The list of score: ");
        System.out.print(score[0]);
        
        for (int i=1;i<N;i++){
            if(score[i]>high)
                high=score[i];
            if (score[i]<low)
                low=score[i];
            sum+=score[i];
            System.out.print(" "+score[i]);
        }
        
        int avr = sum/N;
        
        System.out.println("\nLowest Score: "+low);
        System.out.println("Highest Score: "+high);
        System.out.println("Average Score: "+avr);
     
    keyboard.close();    
    }
    
}
