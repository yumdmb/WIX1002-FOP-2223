
package lab2;

import java.util.Scanner;

public class L2q2 {

  
    public static void main(String[] args) 
    {
     Scanner s = new Scanner(System.in);  
     double P, D, R, Y, M;
     
        System.out.print("Price of car : ");
        P= s.nextDouble();
        System.out.println();
        
        System.out.print("Down Payment : ");
        D = s.nextDouble();
        System.out.println();
        
        System.out.print("Interest rate in % :");
        R = s.nextDouble();
        System.out.println();
        
        System.out.print("Loan duration in a year :");
        Y = s.nextDouble();
        System.out.println();
        
        M = (P - D) * (1+R*Y/100)/(Y*12);
        System.out.printf("Monthly payment : %-6.2f ", M);    
          
    }
    
}
