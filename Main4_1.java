import java.util.Scanner;
 
public class Main4_1 {
 
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int numberOfPeople = read.nextInt();
       
	   read.close();
       for (int i = 0; i < numberOfPeople; i++) {
           welcome();
       }
   }
   public static void welcome() {
       System.out.println("Welcome!");
   }
}
