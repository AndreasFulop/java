import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class M6_11FileToRead {
    public static void main(String[] args) {
        try {
            File x = new File("/home/andras/git/java/java/test.txt");
            Scanner scanner = new Scanner(x);      
            while(scanner.hasNext()) {
                System.out.println(scanner.next());
              }
            scanner.close();
          }
           catch (FileNotFoundException e) {
               System.out.println("File not found!");
          }
    }
}

//why does not works with every file?