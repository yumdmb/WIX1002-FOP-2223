package lab7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class l7q1 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream objoutstr = new ObjectOutputStream(new FileOutputStream("C:\\Users\\USER\\Documents\\Documents2\\WIX1002\\lab4\\src\\lab7\\Lab07_src\\coursename.dat"));
            String[] course_code = {"WXES1116", "WXES1115", "WXES1110", "WXES1112"};
            String[] course_name = {"Programming I", "Data Structure", "Operating System", "Computing Mathematics I"};
            for (int i = 0; i < course_code.length; i++) {
                objoutstr.writeUTF(course_code[i]);
                objoutstr.writeChar(':');
                objoutstr.writeUTF(course_name[i]);
                objoutstr.writeChar(',');
            }
            objoutstr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        try {
            ObjectInputStream objinpstr = new ObjectInputStream(new FileInputStream("C:\\Users\\USER\\Documents\\Documents2\\WIX1002\\lab4\\src\\lab7\\Lab07_src\\coursename.dat"));
            Scanner keyboard = new Scanner(System.in);

            System.out.print("Enter a course code: ");
            String courseCode = keyboard.next();
            keyboard.close();
            while (true) {
                String stuff = objinpstr.readUTF();
                objinpstr.readChar();

                if (stuff.equalsIgnoreCase(courseCode)) {
                    System.out.println(objinpstr.readUTF());
                    objinpstr.close();
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
