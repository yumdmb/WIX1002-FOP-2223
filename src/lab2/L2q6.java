
package lab2;

import java.util.Scanner;

class L2q6 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in grams: ");
        double M = sc.nextDouble();
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double FI = sc.nextDouble();
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double FF = sc.nextDouble();
         
        double I = (FI - 32) *1.8;
        double F = (FF - 32) *1.8;
        double Q = M/1000 * (F - I) * 4184;
        
        System.out.printf("The energy needed is %.6g", Q);
    }
}

//Use the same data type 

//Scanner k = new Scanner(System.in);
//        double M, ini, fin, Q;
//        System.out.print("Enter the amount of water in gram: ");
//        M = k.nextDouble();
//        System.out.print("Enter the initial temperature in Fahrenheit: ");
//        ini = k.nextDouble();
//        System.out.print("Enter the final temperature in Fahrenheit: ");
//        fin = k.nextDouble();
//        Q = (M / 1000) * ((fin - 32) - (ini - 32)) / 1.8 * 4184;
//        System.out.printf("The energy needed is %e\n", Q);


/*
public class L2q6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double Q, tempI, tempF, M;
        
        System.out.print("Enter the amount of water in gram : ");
        M = s.nextDouble();
        
        System.out.print("Initial temperature in celsius: ");
        tempI = s.nextDouble();
        
        System.out.print("Final temperature in celsius: ");
        tempF = s.nextDouble();
        
        Q = (M/1000) * (tempF - tempI) * 4184;
        System.out.printf("The energy needed to heat water is %6.6f joules\n", Q);
    }
}

*/