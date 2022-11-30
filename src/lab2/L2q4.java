
package lab2;
import java.util.Scanner;

public class L2q4{
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num ,hour ,min , sec;
        
        System.out.print("Enter the number of seconds: ");
        num=s.nextInt();
        
        
        // this part study
        hour=num/3600;
        min =  (num/60)-(hour*60);
        sec = num  - hour*3600 - min*60;
        
       /* 
    h = input / 3600;
    s=input%3600;
    m = s/60;
    s%=60;
        */
        
        System.out.print(num + "seconds is  " + hour + "hours," + min + "minutes and " + sec + "seconds\n");
    }
}




/*

package L2Q4;

import java.util.Scanner;

class l2q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int sec = sc.nextInt();
        int hours = sec / 3600;
        int minutes = (sec % 3600) / 60;
        int seconds = sec % 60;
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds", sec, hours, minutes, seconds);
    }
}

*/