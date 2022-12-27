package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class l7q6 {

    public static void main(String[] args) {
        String[] prodID = new String[7];
        String[] prodName = new String[7];
        String[] prodID_ord = new String[5];
        int[] qty = new int[5];
        double[] prodPrice = new double[10];
        int i=0, j=0;
        
        try{
            Scanner sc_pro = new Scanner(new FileInputStream("C:\\Users\\USER\\Documents\\Documents2\\WIX1002\\lab4\\src\\lab7\\Lab07_src\\product.txt"));
            Scanner sc_ord = new Scanner(new FileInputStream("C:\\Users\\USER\\Documents\\Documents2\\WIX1002\\lab4\\src\\lab7\\Lab07_src\\order.txt"));
            
            while(sc_pro.hasNextLine()){
                String[] prod = sc_pro.nextLine().split(",");
                prodID[i] = prod[0];
                prodName[i] = prod[1];
                prodPrice[i] = Double.parseDouble(prod[2]);
                i++;
            }
            
            while(sc_ord.hasNextLine()){
                String[] ord = sc_ord.nextLine().split(",");
                prodID_ord[j] = ord[1];
                qty[j] = Integer.parseInt(ord[2]);
                j++;
            }
            
            System.out.print("ProductID       ");
            System.out.print("ProductName       ");
            System.out.print("Quantity       ");
            System.out.print("PricePerUnit       ");
            System.out.print("Total\n");
            
            for(j=0 ; j<prodID_ord.length ; j++){
                for(i=0 ; i<prodID.length ; i++){
                    if(prodID_ord[j].equals(prodID[i])){
                        System.out.printf("%-9s", prodID[i]);
                        System.out.printf("%-27s", prodName[i]);
                        System.out.printf("%-2d", qty[j]);
                        System.out.printf("%21.2f", prodPrice[i]);
                        System.out.printf("%14.2f\n", qty[j]*prodPrice[i]);
                        break;
                    }
                }
            }
            
            sc_pro.close();
            sc_ord.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }    
    }
}