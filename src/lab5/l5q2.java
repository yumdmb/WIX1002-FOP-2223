
package lab5;

import java.util.Random;

public class l5q2 {
    public static void main(String[] args) {
        Random rng = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = rng.nextInt(21);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
