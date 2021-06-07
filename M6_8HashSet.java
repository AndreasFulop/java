import java.util.HashSet;
import java.util.Scanner;
public class M6_8HashSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        String justASet = scanner.nextLine();
        set.add(justASet);
        set.add("Tom");
        set.add("Robert");
        
        scanner.close();
        //Collections.sort(set)
        System.out.println(set);
    }
}