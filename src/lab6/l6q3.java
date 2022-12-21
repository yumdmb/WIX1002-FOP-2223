package lab6;

import java.util.Random;

public class l6q3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] list = new int[10];

        System.out.print("The original list: ");
        for(int i=0;i<10;i++){
            list[i] = rand.nextInt(9);
            System.out.print(list[i]);
        }
        System.out.println();

        System.out.print("The reversed list: ");
        reverse(list);
    }

    public static void reverse(int[] list){
        for(int i=list.length-1;i>=0;i--){
            System.out.print(list[i]);
        }
        System.out.println();
    }

}
