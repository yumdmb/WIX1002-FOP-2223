package lab2;


import java.util.Scanner;

public class L2q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("The temperature in degree Fahrenheit: ");
        double fah = s.nextDouble();
        double cel = (fah - 32)/1.8;
        s.close();
        
        System.out.printf("The temperature in degree Celsius is %.2f", cel );
    }
}