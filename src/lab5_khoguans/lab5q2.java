
package lab5_khoguans;

import java.util.Random;
public class lab5q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] number = new int[10];
        boolean status;

        for (int i = 0; i < number.length; i++) {
            status = true;
            int gen = rand.nextInt(21);
            for (int j = 0; j < i; j++) {
                if (gen == number[j]) {
                    status = false;
                    break;
                }
            }
            if (status) {
                number[i] = gen;
            } else {
                i--;
            }
        }
        
        System.out.print("10 non-duplicate integer :");
        for (int i=0; i<number.length;i++){
            System.out.print(number[i]+" ");
            
        }
    }
    
}
