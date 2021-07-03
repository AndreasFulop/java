package Sandbox.src;

public class Sorting2D {
    public static void main(String[] args) {
    
        int[] arr = {3,5,2,5,1};
        int[] kati = Kata.flip('L', arr);
        for (int i = 0; i < kati.length; i++) {
            System.out.print(kati[i]+" ");
        }
    }
    public static class Kata {
  public static int[] flip(char dir, int[] arr) {
    int max = arr[0];
    int maxSite = 0;
    int temp;
    if (dir == 'R') {
        for (int j=0;j<arr.length;j++){
          max = 0;
          for (int i=arr.length-1;i>j-1;i--) {
            if (max < arr[i]) {max = arr[i];maxSite = i;}
          }
          temp = arr[0+j];
          arr[0+j] = max;
          arr[maxSite] = temp;
        }
    }
    else {
      for (int j=0;j<arr.length;j++){
        max = 0;
        for (int i=0;i<arr.length-j;i++) {
          if (max < arr[i]) {max = arr[i];maxSite = i;}
        }
        temp = arr[arr.length-1-j];
        arr[arr.length-1-j] = max;
        arr[maxSite] = temp;
      }     
    }
    return arr;
  } 
}
}