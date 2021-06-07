import java.util.Scanner;
    public class M5_8TypeCasting {
        public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
         char a = read.next().charAt(0);
         read.close();
         
         int num = (int)a;
         System.out.println("The ASCII code is: " + num);
  
        }
   }
  