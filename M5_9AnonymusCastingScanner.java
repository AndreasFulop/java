    import java.util.Scanner;
    public class M5_9AnonymusCastingScanner {
        public static void main(String[] args) {
         System.out.println("Are you a regular (1) or special (any other integer) customer?");
         Scanner read = new Scanner(System.in);
         int regularCustomer = read.nextInt();
         read.close();

         PurchaseScanner regular = new PurchaseScanner();

         PurchaseScanner special = new PurchaseScanner(){
         @Override public void totalAmount() {
            System.out.println("Mrs., You get a 20% discount...");
            }
         };
         if (regularCustomer == 1){
            regular.totalAmount();
         }
         else {
            special.totalAmount();
         }
        }
   }

   class PurchaseScanner {
    public void totalAmount(){
        System.out.println("Mr., You get a 10% discount...");
    }
}