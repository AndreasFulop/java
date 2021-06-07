public class M5_14TypeRecognizing {/*
    public static void main(String[] args) {
        A object = new A();
        object.printType(2);
        class A {
            private void printType(){
            System.out.println("A");
            }
            private void printType(String str){
                System.out.println("B");
            }
            private void printType(int x){
                System.out.println("C");
            }
        }
    }*/
    private void printType(){
        System.out.println("A");
    }
    private void printType(String str){
        System.out.println("B");
    }
    private void printType(int x){
        System.out.println("C");
    }
    public static void main(String[] args) {
        M5_14TypeRecognizing object = new M5_14TypeRecognizing();
        object.printType(2);
        object.printType();
        object.printType("This is a string");
    }

}    