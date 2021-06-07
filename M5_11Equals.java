public class M5_11Equals {
    public static void main(String[] args) {
        Robot AI1 = new Robot (1);
        Robot AI2 = new Robot (1);
        //Despite having two objects with the same name, the equality testing returns false, because we have two different objects (two different references or memory locations).
        System.out.println(AI1 == AI2);
                }
            }
        
    class Robot{
                int id;
                 Robot (int i) {
                    id = i;
                 }
        }
