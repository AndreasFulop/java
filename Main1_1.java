
public class Main1_1 {
  public static void main(String[] args) {
/*    int radius = 4;
    double pi = 3.14;
    double perimeter = 2*radius*pi;
    double area = radius*radius*pi;
    System.out.println("The perimeter of the circle = " + perimeter);
    System.out.println("The area of the circle = " + area);*/
    System.out.println(closeCompare(3,5,3));

  }


  public static int closeCompare(double a, double b, double margin) {
    int sum;
    if (a > b + margin){
      sum =1 ;}
  else if (a < b-margin){
   sum = -1;}
   else {   
    sum = 0;}
return sum;
  }
}