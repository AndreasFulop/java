
public class Main2_2 {
    public static void main(String[] args) {
        boolean isSuspended = false;
        int ourScore = 2;
        int theirScore = 2;
        
        if (isSuspended == false){
            if (ourScore > theirScore) {
                System.out.println("Won");
            }
            else if (ourScore == theirScore) {System.out.println("Draw");
            }
            else {System.out.println("Lose");
            }
        }
        else {
            System.out.println("Suspended");
        }
    }
 }
 