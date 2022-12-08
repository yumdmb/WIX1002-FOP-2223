
package lab6;

public class l6q6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + ": " + triangularNumber(i));
        }
    }
    
    //Java Method that returns a triangular number(using ChatGPT)
      public static int triangularNumber(int n) {
        return (n * (n + 1)) / 2;
    }
    
}
