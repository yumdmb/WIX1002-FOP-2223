package lab6;

    import java.util.Scanner;

    public class l6q2_2 {

    
        public static void main(String[] args) {
        
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter number of Row: ");
            int row = keyboard.nextInt();
            System.out.print("Enter Symbol: ");
            char sym = keyboard.next().charAt(0);
            
            System.out.println("Diamond: ");
            for(int i=1; i<=row; i++){
                for(int j=row; j>i; j--){
                    System.out.print(" ");         
                }
                multiPrint(2*i-1, sym);
                System.out.println();
            }

            System.out.println("Diamond :");
            for(int i=1; i<=row/2+1; i++){
                for(int j=row; j>i; j--){
                    System.out.print(" ");         
                }
                multiPrint(2*i-1, sym);
                System.out.println();
            }
            for(int i=row/2; i>=1; i--){
                for(int j=row; j>i; j--){
                    System.out.print(" ");         
                }
                multiPrint(2*i-1, sym);
                System.out.println();
            }
        keyboard.close();    
        }
        public static void multiPrint(int n, char c){
            for(int i=1; i<=n; i++){
            System.out.print(c);
            }    
        }
        
    }
