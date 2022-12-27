package lab6;

import java.util.Random;
import java.util.Scanner;


public class l6q5 {
public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    int score=0;

    while(true){
        int a =rand.nextInt(13);
        int b = rand.nextInt(13);
        System.out.println("Enter negative number to quit.");
        System.out.print(a + " x " + b + " = ");
        int c = keyboard.nextInt();

        if(c<0) {
            break;
        }

        if(multCheck(a,b,c)){
            score++;
        }

    }
    System.out.println("Your score is " + score);
    
    keyboard.close();
} 

public static boolean multCheck(int a,int b, int c) {
    boolean valid = false;
    if(c==a*b){
        valid=true;
    }
    return valid;
}


}
