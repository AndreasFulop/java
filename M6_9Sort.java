import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class M6_9Sort {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        Scanner scanner = new Scanner(System.in);
        
        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
        }
        scanner.close();
        int maxNums = Collections.max(nums);
        int minNums = Collections.min(nums);
        System.out.println("OK, the maximum is: " + maxNums);
        System.out.println("OK, the minimum is: " + minNums);
    }
}