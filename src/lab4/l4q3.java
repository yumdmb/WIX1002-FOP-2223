package lab4;

import java.util.Scanner;
import java.lang.Math;

public class l4q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score, minscore = 9999, maxscore = -1, count = 0;
        int sum = 0, sumsquare = 0;
        double avg, stddev;
        do {
            System.out.print("Enter a score: ");
            score = sc.nextInt();
            if (score < 0) {
                break;
            }
            if (score < minscore) {
                minscore = score;
            } else if (score > maxscore) {
                maxscore = score;
            }
            sum += score;
            sumsquare += Math.pow(score, 2);
            count++;
        } while (true);
        avg = (double) sum / count;
        stddev = Math.sqrt((sumsquare - (Math.pow(sum, 2) / count)) / count-1);
        System.out.println(sumsquare);
        System.out.println("The minimum score is " + minscore);
        System.out.println("The maximum score is " + maxscore);
        System.out.println("The average score is " + avg);
        System.out.println("The standard deviation is " + stddev);
    }
}
    


//import java.util.Scanner;
//
//public class l4q3 {
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        double avg, std;
//        int max = 0, min = 0, N = 0, score = 0, sum = 0, sum_sq = 0, temp;
//        
//        do{
//            System.out.print("Enter a score (negative score to quit): ");
//            score = s.nextInt();
//            
//            if (score >= 0){
//                N++;
//                
//                if (N == 1){
//                    max = score;
//                    min = score;
//                }
//                
//                temp = score;
//                sum += score;
//                sum_sq += score*score;
//
//                if (temp < min){
//                    min = temp;
//                }
//
//                else if (temp > max) {
//                    max = temp;
//                }
//            }
//        }
//        while(score >= 0);
//            
//        if (score == -1 && N > 0){
//            System.out.println("Minimum Score: " + min);
//            System.out.println("Maximum Score: " + max);
//            
//            avg = sum / N;
//            std = Math.sqrt((sum_sq-((sum*sum)/N))/(N - 1));
//            
//            System.out.printf("Average Score: %-6.2f\n", avg);
//            System.out.printf("Standard Deviation: %-6.2f\n", std);
//        }
//    }
//}