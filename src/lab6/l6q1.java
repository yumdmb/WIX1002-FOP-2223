package lab6;

public class l6q1 {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++) {
            System.out.println(i + ": " + triangleNumber(i));
        }
    }

    public static int triangleNumber(int n) {
        return (n * (n+1))/2;
    }

}




// // khogu method  
// public static int getTriangle(int a) {
//     int sum = 0;
//     for(int i=1;i<=a;i++){
//         sum+=1;
//     }
//     return sum;
// }

