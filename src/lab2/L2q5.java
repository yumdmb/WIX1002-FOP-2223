
package lab2;


import java.util.Random;

public class L2q5 {

    public static void main(String[] args) {
        Random r = new Random();
        int max = 10000;
        int total = 0;
        
        int num = r.nextInt(max);
        
        System.out.println("The number is " + num);
        
        do{
            total += num%10;
            num /= 10;
        } while (num >0);
        
        System.out.println("The sum of all the digits in the number is " + total);
    }
}

/*    sum+= num/10000;
    num%=10000;
    sum+= num/1000;
    num%=1000;
    sum+= num/100;
    num%=100;
    sum+= num/10;
    num%=10;
    sum+=num;
&/

/*package L2Q5;

import java.util.Random;

class L2Q5 {
    public static void main(String[] args) {
        Random rng = new Random();
        int num = rng.nextInt(10000);
        System.out.println("Random number: " + num);
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
*/