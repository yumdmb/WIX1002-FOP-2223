
package lab3;

import java.util.Scanner;
public class l3q1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    String z;
    int a,b,c;
    
        System.out.print("Enter two integer : ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        
        System.out.print("Enter at operand : ");
         z = keyboard.next();
         
         char i=z.charAt(0);
         switch(i){
             case '+' -> {
                 c=a+b;
                 System.out.println(a+ "+" + b + "=" + c  );
            }
             case '-' -> {
                 c=a-b;
                 System.out.println(a + "-" + b + "=" + c );
            }
             case '*' -> {
                 c=a*b;
                 System.out.println(a + "*" + b + "=" + c );
            }
             case '/' -> {
                 c=a/b;
                 System.out.println(a + "/" + b + "=" + c );
            }
             case '%' -> {
                 c=a%b;
                 System.out.println(a + "%" + b + "=" + c );
            }
               
         }
         
    }
    
}
