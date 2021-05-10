import java.util.Scanner;

public class Main2_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double amount = scanner.nextInt();
		int i = 0;
		while (i < 3){
		double payment = amount*0.1;
		amount = amount - payment;
		i++;
		}
		int amountOK = (int) Math. round(amount);
        System.out.println(amountOK);
        scanner.close();
	}
}