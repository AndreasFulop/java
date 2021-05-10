public class Main2_6 {
    public static void main(String[] args) {
        int firstBadGuy = 1;
        int secondBadGuy = 4;

        for (int i = 1; i < 8; i++) {
            if (i == firstBadGuy || i == secondBadGuy){
                System.out.println("Bad guy");
            }
            else {
                System.out.println("Good guy");
            }
        }
    }    
}