
class M6_3Threads {
    public static void main(String[ ] args) {
        Name name = new Name();
        name.setPriority(4);
        
        Welcome welcome = new Welcome();
        welcome.setPriority(10);
        
        name.start();
        welcome.start();
    }
}
 
class Welcome extends Thread {
    public void run() {
        System.out.println("Welcome!");
    }
}
 
class Name extends Thread {
    public void run() {
        System.out.println("Please enter your name");
    }
}
