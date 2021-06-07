import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class M6_10Iterator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numsAgain = new LinkedList<Integer>();
        
        while(numsAgain.size()<5){
            int num = scanner.nextInt();
            numsAgain.add(num);
        }
        scanner.close();
        int sum = 0;
        Iterator <Integer> sumNum = numsAgain.iterator();
        while (sumNum.hasNext()) {
            int value = sumNum.next();
            sum += value;
        } 
        
        System.out.println(sum);
    }
}