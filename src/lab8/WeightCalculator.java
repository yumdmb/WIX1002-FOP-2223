//L8Q3

package lab8;

import java.util.Scanner;

public class WeightCalculator {
    private int age;
    private double height , weight;

    public WeightCalculator() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter age :");
        age=keyboard.nextInt();
        System.out.println();
        System.out.print("Enter height :");
        height=keyboard.nextDouble();
        System.out.println();
        keyboard.close();
    }

    public void getWeight() {
        weight = (height-100+age/10)*0.9;
    }

    // public double recommendedWeight(){
    //     return (height - 100 + age/10) * 0.9;
    // }
    
    public void output() {
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Recommended weight: " + weight);
    }

    class l8q3 {
        public static void main(String[] args) {

        }
    }

}
