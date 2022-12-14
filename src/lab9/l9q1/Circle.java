package lab9.l9q1;

import java.util.Scanner;

public class Circle extends Shape {

    protected double diameter;

    // Constructor
    public Circle() {
        super("Circle");
        this.inputDiameter();
        this.compute();
    }

    // Methods
    private void inputDiameter() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the diameter of circle: ");
        this.diameter = keyboard.nextDouble();
        keyboard.close();
    }

    private void compute() {
        this.perimeter = Math.PI * this.diameter;
        this.area = Math.PI * this.diameter * this.diameter / 4.0;
    }
}