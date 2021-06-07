import java.util.Scanner;
public class M6_4Sleep {
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
        
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            
            String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};
            scanner.close();
            try {
            System.out.println(categories[choice]);
            } catch(Exception e) {
                System.out.println("Wrong option");
            }
        } catch (InterruptedException e) {
            System.out.println("Failed slowtime");
        }
    }
}



