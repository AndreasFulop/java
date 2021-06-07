    public class M5_9AnonymusCasting {
        public static void main(String[] args) {
         Purchase regular = new Purchase();

         Purchase special = new Purchase(){
         @Override public void totalAmount() {
            System.out.println("Mrs., You get a 20% discount...");
            }
        };

        regular.totalAmount();
        special.totalAmount();
       }
   }

   class Purchase {
    public void totalAmount(){
        System.out.println("Mr., You get a 10% discount...");
    }
}