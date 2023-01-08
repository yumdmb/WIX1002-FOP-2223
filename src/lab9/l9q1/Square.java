package lab9.l9q1;

import java.util.Scanner;

public class Square extends Shape {

    protected double side;

    // Constructor
    public Square() {
        super("Square");
        this.inputSide();
        this.compute();
    }

    // Methods
    private void inputSide() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter side length of square: ");
        this.side = keyboard.nextDouble();
        keyboard.close();
    }

    private void compute() {
        this.perimeter = this.side * 4;
        this.area = this.side * this.side;
    }
}
