//L8Q4
package lab8;

import java.util.Scanner;

public class Fraction {
    private int numerator, denominator;

    public Fraction (int n, int d) {
        numerator = n;
        denominator = d;
    }


    public void setNumerator(int n) {
        numerator=n;
    }
    public int getNumerator() {
        return numerator;
    }
    public void setDenominator(int d) {
        denominator=d;
    }
    public int getDenominator() {
        return denominator;
    }

    public int gcd() {
        int m, n,temp;
        m=getNumerator();
        n=getDenominator();

        if(m<n) {
            temp=m;
            m=n;
            n=temp;
        }
        while(n>0) {
            temp = m%n;
            m=n;
            n=temp;
        }
        return m;
    }

public void output() {
    int a = gcd();
    System.out.println("The fraction : "+ getNumerator()/a + "/" + getDenominator()/a);
    //System.out.printf("The simplest fraction is %d/%d", numerator/a, denominator/a);
}

// public void input() {
//     Scanner keyboard = new Scanner(System.in);
//     System.out.print("Enter numerator: ");
//     setNumerator(keyboard.nextInt());
//     System.out.println();
//     System.out.print("Enter denominator: ");
//     setDenominator(keyboard.nextInt());
//     System.out.println();

//     keyboard.close();
// }

class l8q4 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter numerator: ");
        int n = keyboard.nextInt();
        System.out.print("Enter denominator: ");
        int d = keyboard.nextInt();
        Fraction f = new Fraction(n, d);
        f.output();
    }


}


}
