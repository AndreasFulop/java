import java.util.Scanner;

public class M4_7GetterSetter {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String name = read.nextLine();
        int age = read.nextInt();
        Student student = new Student();
        student.name = name;
        student.setAge(age);        
        read.close();
        
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.getAge());
    }
 }
  
 class Student {
  
    public String name;
    private int age;
    
    public int getAge() {
        if (age < 0) {
            System.out.println("Invalid age!");
            return this.age = 0;
        }
        else return this.age;        
    }

    public void setAge(int age) {
            this.age = age;
        }
    }
 

