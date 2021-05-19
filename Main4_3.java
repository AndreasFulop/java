import java.util.Scanner;
 
public class Main4_3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double score1 = read.nextDouble();
        double score2 = read.nextDouble();
        double score3 = read.nextDouble();
        double score4 = read.nextDouble();
        double avgScore = getAverageScore(score1, score2, score3, score4);
        System.out.println(avgScore);
        read.close();
    }
 
    public static double getAverageScore(double score1, double score2, double score3, double score4) {
    return (score1 + score2 + score3 + score4) / 4;
    }
}
