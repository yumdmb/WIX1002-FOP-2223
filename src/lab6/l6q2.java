package lab6;


public class l6q2 {
    public static void multiPrint(int n, int c){
        for(int i=0;i<n;i++)
        System.out.print(c);
        
    }

    public static void main(String[] args) {
        multiPrint(2,' ');
        multiPrint(1,'*');
        System.out.println();
        multiPrint(1, ' ');
        multiPrint(3, '*');
        System.out.println();
        multiPrint(5, '*');

    }
    
}
