import java.util.Scanner;
 public class M5_4Override  {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       double saving = read.nextDouble();
       double checking = read.nextDouble();
 
       Account savingAcc = new SavingAcc(saving);
       Account checkingAcc = new CheckingAcc(checking);
 
       System.out.println(savingAcc.getIncome(saving));
       System.out.println(checkingAcc.getIncome(checking));
       read.close();
   }
}
class Account {
 
   private double amount;
   public Account(double amount) {
       this.amount = amount;
   }
   public double getAmount() {
       return amount;
   }
   public double getIncome(double amount) {
       return amount*0;
   }
}
 
class SavingAcc extends Account {
   public SavingAcc(double amount) {
       super(amount);
   }
   @Override
   public double getIncome(double amount) {
       return amount += amount*0.2;
   }
}
class CheckingAcc extends Account {
   public CheckingAcc(double amount) {
       super(amount);
   }
   @Override
   public double getIncome(double amount) {
       return amount += amount*0.05;
   }
}
