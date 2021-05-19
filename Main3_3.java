 
public class Main3_3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 0},
        };
        for (int i=0;i<3;i++){
            for (int j: matrix[i]){
                System.out.print(j);
            };
            System.out.println("");
        };
        
    }
}
