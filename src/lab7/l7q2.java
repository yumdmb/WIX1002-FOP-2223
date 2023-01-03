package lab7;

import java.util.Scanner;
import java.net.URL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLConnection;
//import java.io.BufferedWriter;
//import java.io.Writer

public class l7q2 {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\Users\\USER\\Documents\\Documents2\\WIX1002\\lab4\\src\\lab7\\Lab07_src\\index.htm", true));
           
            while(in.hasNextLine()){
                writer.print(in.nextLine());
            }
            
            writer.close();
            in.close();
            }
            catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
            }
           
    }
}
