public class M5_12Enum {
    public static void main(String[] args) {
        Difficulty a = Difficulty.HARD;
        switch(a){
            case EASY:
            System.out.println("You have 3000 bullets");
            break;
            case MEDIUM:
            System.out.println("You have 2000 bullets");
            break;
            case HARD:
            System.out.println("You have 1000 bullets");
            break;
        }
    }
}    
enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}