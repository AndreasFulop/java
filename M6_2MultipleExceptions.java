import java.util.Scanner;
import java.util.InputMismatchException;
 
public class M6_2MultipleExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(num1/num2);
        } catch(ArithmeticException e1) {
            System.out.println("Division by zero");
        } catch(InputMismatchException e2){
            System.out.println("Wrong value type");          
        }
        scanner.close();
    }
}
/*
public class M6_2MultipleExceptions {
    public static void main(String[] args) {
        int div (int aa, int bb) throws ArithmeticException{
            if (bb == 0) {
                throw new ArithmeticException("Division by zero");
            } else {
                return aa / bb;
            }
        }
    }
}
*/
