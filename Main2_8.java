import java.util.Scanner;
public class Main2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Choose a number between 0 and 4!");
        do {
            number = scanner.nextInt();
            switch (number) {
            case 0: 
                System.out.println("Exit");
                break;
            case 1:    
                System.out.println("Language selection");
                break;
            case 2: 
                System.out.println("Customer support");
                break;
            case 3: 
                System.out.println("Check the balance");
                break;
            case 4: 
                System.out.println("Check loan balance");
                break;
            default:
                System.out.println("Choose a number between 0 and 4!");
                break;
            }
        }
        while(number != 0);
        scanner.close();
    }
}
