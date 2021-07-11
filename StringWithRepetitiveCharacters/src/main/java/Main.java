//1. Please write a code which finds substrings in a string, which length > 1 and contains the same characters. For
// example if the input of method is  'aabcdddd', it returns 'aa,dddd'.


import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String test ="ab";
   //     String test = inputString(); //if you want to add the String yourself, just comment out line 9 instead of this line
        System.out.println(coding(test));
    }

    public static String coding(String input) {
        if (input == null || input.length() > 100) {
                throw new IllegalArgumentException();
            }
            String output = "";
            String temp = "";
            for (int i = 1; i < input.length(); i++) {
                char a = input.charAt(i);
                if (a == input.charAt(i - 1)) {
                    if (temp.length() < 1) {
                        temp += a;
                    }
                    temp += a;
                } else {
                    if (temp.length() > 1) {
                        output += temp + ",";
                        temp = "";
                    }
                }
            }
            if (temp.length() > 1) {
                output += temp + ",";
            }
            if (output != "") {
                output = output.substring(0, output.length() - 1);
            }
            else {
                output = "There is nothing to print.";
            }
            return output;
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        String read = scanner.nextLine();
        return read;
    }
}
