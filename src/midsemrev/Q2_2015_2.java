package midsemrev;
import java.util.Scanner;

public class Q2_2015_2 {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       String durian;
       double sales;
       double total=0.0;
       
       do{ //input=1 mark 
           System.out.println("Enter the type of durian[Quit] to terminate:");
           durian=keyboard.nextLine();
           
           if(durian.equals("Quit")) //terminate = 1 mark 
                break;
                System.out.print("Enter the sales in kg:"); //input = 1 mark
                sales=keyboard.nextDouble();
                keyboard.nextLine();
                //if comparsion and salea calculation = 3 marks  // we use the same total for each fruits bcs we want to get total for all not each 
                   if(durian.equals("MK")){
                       total+=sales*25;
                     }
                   if(durian.equals("HL")){
                       total+=sales*22;
                     }
                   if(durian.equals("D24")){
                       total+=sales*20;
                     }
                   if(durian.equals("UM")){
                       total+=sales*18;
                     }
       }while(!durian.equals("Quit")); // loop = 2 marks 
            System.out.printf("Total sales:%.2f\n",total);  //output = 1 mark    2 decimal places = 1 mark 
    keyboard.close();           
    }
    
}