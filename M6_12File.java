import java.io.File;
import java.util.Scanner;
import java.util.Formatter;
import java.io.FileNotFoundException;
public class M6_12File {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("/home/andras/git/java/java/test.txt");
            int count = 0;
            while(count < 3) {
                f.format("%s", input + "\r\n");
                count++;
            }
            f.close();
        }
        catch (Exception e) {
            System.out.println("Error!");
        }
        input.close();
        readFile();
    }
 
      public static void readFile() {
        try {
            File x = new File("/home/andras/git/java/java/test.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error, file not found!");
        }
      }
}
