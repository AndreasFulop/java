import java.util.Scanner;
public class M4_13BinaryConverter {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        System.out.println(Converter.toBinary(x));
    }
}

class Converter {
    public static String toBinary(int num) {
        String binary="";
        while(num > 0) {
            binary = (num%2)+binary;
            num /= 2;
        }
        return binary;
    }
}
        