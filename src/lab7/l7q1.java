package lab7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

// import java.io.*;

public class l7q1 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\USER\\Documents\\Documents2\\WIX1002\\lab4\\src\\lab7\\Lab07_src\\coursename.dat"));
            String[] course_code = {"WXES1116", "WXES1115", "WXES1110", "WXES1112"};
            String[] course_name = {"Programming I", "Data Structure", "Operating System", "Computing Mathematics I"};
            for (int i = 0; i < course_code.length; i++) {
                outputStream.writeUTF(course_code[i]);
                outputStream.writeChar(':');
                outputStream.writeUTF(course_name[i]);
                outputStream.writeChar(',');
            }
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\USER\\Documents\\Documents2\\WIX1002\\lab4\\src\\lab7\\Lab07_src\\coursename.dat"));
            Scanner keyboard = new Scanner(System.in);

            System.out.print("Enter a course code: ");
            String courseCode = keyboard.next();
            keyboard.close();
            while (true) {
                String course = inputStream.readUTF();
                inputStream.readChar();

                if (course.equalsIgnoreCase(courseCode)) {
                    System.out.println(inputStream.readUTF());
                    inputStream.close();
                }
            }    
        } catch (EOFException e) {

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error when read the file");
        }
    }
}
