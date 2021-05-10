public class Main2_7 {
    public static void main(String[] args) {
        int number = 7;
        do {
            if (number % 3 != 0 || number == 0) {
                System.out.println(number);
            };
            number--;
        }
        while (number >= 0);

    }    
}