import java.util.ArrayList;
import java.util.Scanner;
public class M6_5ArrayList {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> evennums = new ArrayList<Integer>();
        int evennumsNumber = 0;
        while(evennums.size()<3){
            int num = scanner.nextInt();
            evennums.add(num);
            evennumsNumber += num;
        }
        int averageEvennums = evennumsNumber / evennums.size();
        System.out.println("The average of your numbers: " + averageEvennums);     
        scanner.close();
    }
}
