import java.util.Scanner;

public class Main4_5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String firstName = read.nextLine();
        String secondName = read.nextLine();
        int age = read.nextInt();
        int roomNumber = read.nextInt();
        Customer customer = new Customer();
        read.close();
        if (firstName.length() < 10){
            customer.firstName = firstName;}
        else customer.firstName = "Sorry, this name was too long! So let's call him/her J.!";
        if (secondName.length() < 10){
            customer.secondName = secondName;}
        else customer.firstName = "Sorry, this name was too long! So let's call him/her Alien.";
        if (age<100){
            customer.age = age;};
        customer.roomNumber = roomNumber;
        customer.saveCustomerInfo();
    }
 }
  
 class Customer {
    String firstName;
    String secondName;    
    int age;
    int roomNumber;
    public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Age: " + age);
        System.out.println("Room number: " + roomNumber);
    }
 }
 
