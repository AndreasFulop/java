import java.util.Scanner;

public class M4_10Maths {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        read.close();
        double result = Math.pow(num1, num2);
        System.out.println(result);
    }
 }
 

