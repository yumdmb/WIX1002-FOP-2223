package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class l7q4 {

    public static void main(String[] args) {
        int char_count=0, word_count=0, line_count=0;
        
        try{
            Scanner keyboard = new Scanner(new FileInputStream("C:\\Users\\USER\\Documents\\Documents2\\WIX1002\\lab4\\src\\lab7\\Lab07_src\\l7q4file.txt"));
            
            while(keyboard.hasNextLine()){
                String line = keyboard.nextLine();
                line_count++;
                char_count += line.length();
                word_count += line.split(" ").length;
            }            
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        
        System.out.println("Number of characters: " + char_count);
        System.out.println("Number of words: " + word_count);
        System.out.println("Number of lines: " + line_count);
    }    
}