
public class Main1_2 {
  public static void main(String[] args) {
    int math = 35;
    int history = 40;
    int geometry = 39;
    int spenthours = (math + history + geometry) / 60;
    int spentmins = (math + history + geometry) % 60;
    System.out.println(spenthours + ":" + spentmins);
  }
}
