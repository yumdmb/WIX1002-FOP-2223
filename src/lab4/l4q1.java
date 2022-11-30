
package lab4;

import java.util.Scanner;

public class l4q1 
{

   
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num=keyboard.nextInt();
        
        System.out.println("The factors are : ");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i +" ");
            }
        }
       
    }
    
}
