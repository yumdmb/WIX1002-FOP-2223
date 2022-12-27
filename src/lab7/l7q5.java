package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class l7q5 {

    public static void main(String[] args) {
        
        try{
            ObjectInputStream objinpstr = new ObjectInputStream(new FileInputStream("C:\\Users\\USER\\Documents\\Documents2\\WIX1002\\lab4\\src\\lab7\\Lab07_src\\person.dat"));
            int num = objinpstr.readInt();
            String[] name = new String[num];
            int[] age = new int[num];
            char[] gender = new char[num];
            
            for(int i=0 ; i<num ; i++){
                name[i] = objinpstr.readUTF();
                age[i] = objinpstr.readInt();
                gender[i] = objinpstr.readChar();
            }
            
            for(int i=0 ; i<num-1 ; i++){
                for(int j=0 ; j<num-1-i ; j++){
                    if(name[j].compareToIgnoreCase(name[j+1])>0){
                        String temp = name[j];
                        name[j] = name[j+1];
                        name[j+1] = temp;
                        
                        int temp1 = age[j];
                        age[j] = age[j+1];
                        age[j+1] = temp1;
                        
                        char temp2 = gender[j];
                        gender[j] = gender[j+1];
                        gender[j+1] = temp2;
                    }
                }
            }
            
            for(int i=0 ; i<num ; i++){
                System.out.println("Name: " + name[i]);
                System.out.println("Age: " + age[i]);
                System.out.print("Gender: ");  //switch so M->Male, F->Female
                switch(gender[i]){
                    case 'M':
                        System.out.println("Male\n");
                        break;
                    case 'F':
                        System.out.println("Female\n");
                        break;
                }
            }
            
            objinpstr.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e){
            System.out.println("Problem reading file");
        }
    }
}