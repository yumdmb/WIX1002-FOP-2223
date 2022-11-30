
package lab3;

import java.util.Scanner;

class l3q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sales, commission;
        System.out.print("Enter sales: ");
        sales = sc.nextDouble();
        if (sales > 1000) {
            commission = sales * 0.125;
        } else if (sales > 500) {
            commission = sales * 0.1;
        } else if (sales > 100) {
            commission = sales * 0.075;
        } else {
            commission = sales * 0.05;
        }
        System.out.printf("Commission is %.2f", commission);
    }
}