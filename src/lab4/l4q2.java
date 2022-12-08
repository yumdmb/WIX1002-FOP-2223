
package lab4;

//import java.util.Scanner;
//
//public class l4q2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int num = sc.nextInt();
//        int sum = 0, sumj=0;
//        for (int i = 1; i <= num; i++)
//        {
//            for (int j = 1; j <= i; j++)
//            {
//                sumj=sumj+j;
//            }
//            sum=sum+sumj;
//            sumj=0;
//        }
//        System.out.println("The sum is: " + sum);
//    }
//}


import java.util.Scanner;

public class l4q2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = keyboard.nextInt();
        int total = 0;
        
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                total = total+ j;
            }
        }
        
        System.out.println(total);

        keyboard.close();
    }    
}