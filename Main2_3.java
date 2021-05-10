
public class Main2_3 {
    public static void main(String[] args) {
        int number = 180;
        
        //your code goes here
        
        if (number % 10 == 0 && number % 9 == 0) {
            System.out.println("You win $200");
        }
        else if (number % 4 == 0 || number % 6 == 0) {
            System.out.println("You win $50");
        }
        else {
            System.out.println("Try again");
        }
    }
 }
 