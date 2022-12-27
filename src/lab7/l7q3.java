package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class l7q3 {

    public static void main(String[] args) {
        try{
            Scanner keyboard = new Scanner(new FileInputStream("C:\\Users\\USER\\Documents\\Documents2\\WIX1002\\lab4\\src\\lab7\\Lab07_src\\fileq7.txt"));
            PrintWriter printer = new PrintWriter(new FileOutputStream("C:\\Users\\USER\\Documents\\Documents2\\WIX1002\\lab4\\src\\lab7\\Lab07_src\\reverse.txt"));
        
            while(keyboard.hasNextLine()){
                String string = keyboard.nextLine();
                for (int i=string.length()-1 ; i>=0 ; i--){
                    printer.print(string.charAt(i));
                }
                printer.println();
            }
            
            keyboard.close();
            printer.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("File output error");
        }
    }
}