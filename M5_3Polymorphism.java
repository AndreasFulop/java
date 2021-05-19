
 public class M5_3Polymorphism  {
    public static void main(String[] args) {
/*        Animal a = new Dog();
        Animal b = new Cat();
        a.makeSound();
        b.makeSound();
    }
 }
    class Animal {
        public void makeSound() {
        System.out.println("Grr...");
        }
    }
  
    class Cat extends Animal {
        public void makeSound() {
        System.out.println("Meow");
        }
    }
  
    class Dog extends Animal {
        public void makeSound() {
        System.out.println("Woof");
        }
    }
*/
       Car Car = new Car();
       Car electric = new ElectricCar();
       Car hybrid = new HybridCar();
       
       //calls
       Car.start();
       Car.resource();
       electric.start();
       electric.resource();
       hybrid.start();
       hybrid.resource();
   }
}
class Car{
    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
}
 
class ElectricCar extends Car{
    public void resource(){
        System.out.println("I use electricity");
    }
}
 
class HybridCar extends Car{
    public void resource(){
        System.out.println("I use both petrol and electricity");
    }
}