public class Main2_5{
    public static void main(String[] args) {
        int number = 14; 

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 10 == 3){
                System.out.println(i);
            }
        }
    }    
}