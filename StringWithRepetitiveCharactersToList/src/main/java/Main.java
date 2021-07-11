//1. Please write a code which finds substrings in a string, which length > 1 and contains the same characters. For
// example if the input of method is  'aabcdddd', it returns 'aa,dddd'.


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String input = "aabcddddxt";
        System.out.println(repetitiveCharacters(input));
    }

    public static String repetitiveCharacters(String input) {
        if (input == null || input.length() > 100) {
            throw new IllegalArgumentException();
        }
        else if (input == "") {
            return input;
        }
        else {
            String output = "";
            ArrayList<Character> chars = new ArrayList<>();
            chars.add(input.charAt(0));
            char[] counter = new char[input.length()];
            counter[0] = ' ';
            for (int i = 1; i < input.length(); i++) {
                if (chars.contains(input.charAt(i))) {
                    counter[i] = input.charAt(i);
                    counter[i - 1] = input.charAt(i);
                } else {
                    chars.clear();
                    chars.add(input.charAt(i));
                    counter[i] = ' ';
                }
            }
            for (int j = 0; j < counter.length; j++) {
                if (counter[j] != ' ') {
                    if (j > 0 && counter[j] != counter[j - 1] && output != "") {
                        output += ",";
                    }
                    output += counter[j];
                }
            }
            //if (output == "") {output = "There is nothing to print.";}
            return output;
        }
    }
}
