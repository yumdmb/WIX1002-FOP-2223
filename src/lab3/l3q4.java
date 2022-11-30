
package lab3;


public class l3q4 {
    
}


//import java.util.Random;
//
//public class L3Q4 {
//
//    public static void main(String[] args) {
//        Random r = new Random();
//        final int MAX = 6;
//        int p11, p12, p21, p22;
//        int p1, p2;
//        
//        p11 = r.nextInt(MAX)+1;
//        System.out.println("Player one first roll: " + p11);
//        p12 = r.nextInt(MAX)+1;
//        System.out.println("Player one second roll: " + p12);
//        p21 = r.nextInt(MAX)+1;
//        System.out.println("Player two first roll: " + p21);
//        p22 = r.nextInt(MAX)+1;
//        System.out.println("Player two second roll: " + p22);
//        System.out.println();
//        
//        p1 = p11 + p12;
//        System.out.println("Player one total: " + p1);
//        p2 = p21 + p22;
//        System.out.println("Player two total: " + p2);
//        System.out.println();
//        
//        if (p1 > p2){
//            System.out.println("Player one wins!");
//        }
//        else if (p1 < p2){
//            System.out.println("Player two wins!");
//        }
//        else {
//            System.out.println("Draw!");
//        }
//    }
//}



//package L3Q4;
//
//import java.util.Random;
//
//class l3q4 {
//    public static void main(String[] args) {
//        Random rng = new Random();
//        int num1, num2, sum1 = 0, sum2 = 0;
//        for (int i = 0; i < 2; i++) {
//            num1 = rng.nextInt(6) + 1;
//            System.out.println("Random number for Player 1: " + num1);
//            sum1 += num1;
//        }
//        for (int i = 0; i < 2; i++) {
//            num2 = rng.nextInt(6) + 1;
//            System.out.println("Random number for Player 2: " + num2);
//            sum2 += num2;
//        }
//
//        if (sum1 > sum2) {
//            System.out.println("Player 1 wins!");
//        } else if (sum1 < sum2) {
//            System.out.println("Player 2 wins!");
//        } else {
//            System.out.println("It's a tie!");
//        }
//    }
//}