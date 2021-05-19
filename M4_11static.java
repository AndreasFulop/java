public class M4_11static {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);
        System.out.println(c1.COUNT);
        System.out.println(c2.COUNT);
        
        Vehicle.horn();
    }
}

class Counter {
    public static int COUNT=0;
    Counter() {
       COUNT++;
    }
}
// you can call this method without creating object
class Vehicle {
    public static void horn() {
      System.out.println("Beep");
    }
}