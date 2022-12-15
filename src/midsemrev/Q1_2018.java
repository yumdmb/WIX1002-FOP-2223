
package midsemrev;

import java.util.Scanner;
import java.util.Random;

public class Q1_2018 {
public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rndm = new Random();
        System.out.print("Enter the number of staff [N] : ");
        int N = keyboard.nextInt();
        int id, idtemp;
        boolean a, b, x;
        for (int i = 0 ; i < N ; i++){
            id = rndm.nextInt(90000) + 10000; // 99999-10000 = 89999   id=rndm.nextInt(90000) + 10000  
            System.out.printf("Staff ID: %d", id);
            idtemp = id;
            idtemp/=10;
            a = idtemp % 2 == 0;
            idtemp/=100;
            b = idtemp % 2 == 1;
            x = a && b;
            if (x){
                System.out.println("\nWeekend Duty");
            } else {
                System.out.println("\nWeekend Off");
            }
        }
    keyboard.close();    
    }
}


/*
int n1=(id/1000)%10;
int n2=(kd/10)%10;

if(n1%2!=0 && n2%2==0){
    wEnd+=1;
    System.outprintIn("Weekend Duty");
    System.out.printIn("Weekend OFF");

}

System.out.printIn("The number of stuffs :" + wEnd)
 */



 /*For example, if max = 31 and min = 7, then (max-min) will be equal to 24. So, nextInt(24) will generate a random number between 0 and 24.
 If it generates 0(the lowest value), then 0 + min will be equal to 7. 
 If it generates 24(the largest value), then 24 + min will be equal to 31, which is the max value. 
 Since nextInt(n) is exclusive of the n value, so our method will also be exclusive of the max value.*/