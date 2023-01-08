//L8Q1

//Method overloading: same name of class but diff. obj

package lab8;

import java.util.Random;

public class Number {

    private int[] num;
    private int size;
    private final int MAX = 100;

    public Number() {
    size = 10;
    num = new int[size];
    Random g = new Random();
    for(int i=0; i<size; i++)
    num[i] = g.nextInt(MAX);
    }

    public Number(int n) {
    size = n;
    num = new int[size];
    Random g = new Random();
    for(int i=0; i<size; i++)
    num[i] = g.nextInt(MAX);
    }
    
    public Number(int n, int r) {
    size = n;
    num = new int[size];
    Random g = new Random();
    for(int i=0; i<size; i++)
    num[i] = g.nextInt(r);
    }

    public void output() {
    System.out.println("The array items are: ");
    for(int i=0; i<size; i++)
    System.out.print(num[i] + " ");

    System.out.println();
    System.out.print("The even numbers are: ");
    for(int i=0; i<size; i++)
    if (isEven(num[i]))
    System.out.print(num[i] + " ");
    System.out.println();
    System.out.print("The prime numbers are: ");
    for(int i=0; i<size; i++)
    if (isPrime(num[i]))
    System.out.print(num[i] + " ");
    System.out.println();
    System.out.println("The maximum numbers is: " + getMax(num));
    System.out.println("The minimum numbers is: " + getMin(num));
    System.out.println("The average is: " + getAverage(num));
    System.out.print("The square numbers are: ");
    for(int i=0; i<size; i++)
    if (isSquare(num[i]))
    System.out.print(num[i] + " ");
    System.out.println();
    }

    public int getMax(int[] a) {
    int max = a[0];
    for(int i=1; i<size; i++)
    if (a[i]>max)
    max = a[i];
    return max;
    }

    public int getMin(int[] a) {
     int min = a[0];
      for(int i=1; i<size; i++)
       if (a[i]<min)
       min = a[i];
     return min;
    }

    public double getAverage(int[] a) {
    double sum = 0.0;
    for(int i=0; i<size; i++)
    sum+=a[i];
    return sum / size;
    }

    public boolean isPrime(int a) {
    if (a==2)
    return true;
    else if(a==0 || a==1)
    return false;
    else if(a%2==0)
    return false;
    else {
    for(int n=3; n<=a; n+=2)
    if(n==a)
    return true;
    else if (a%n==0)
    return false;
    }
    return false;
    }

    public boolean isEven(int a) {
    if (a%2==0)
    return true;
    return false;
    }

    public boolean isSquare(int a) {
     if (a==0)
        return false;
    else {
      for(int i=1; i<=a; i = (i+1)*(i+1))
        if (i==a)
           return true;
    }
    return false;
   }

    }