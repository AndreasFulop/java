import java.util.Scanner;
 
public class Main4_2 {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int width = read.nextInt();
    int height = read.nextInt();
    printArea(width, height);
    read.close();
    }
    
    public static void printArea(int width, int height) {   
   System.out.println(width*height);
    }
    
}
