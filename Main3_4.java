import java.util.Scanner;

public class Main3_4{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		for (int i=arr.length-1;i>-1;i--) {
			System.out.print(arr[i]);
		};
		System.out.println("");
		scanner.close();
	}
}