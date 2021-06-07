
    public class M5_6Abstract {
        public static void main(String[] args) {

       Monopoly monopoly = new Monopoly();
       Chess chess = new Chess();
       Battleships battleships = new Battleships();
       
       monopoly.play();
       chess.play();
       battleships.play();
   }
}
 
abstract class Game {
   public String punctuation = "!";
   abstract String getName();
   abstract void play();
}
 
class Monopoly extends Game {
   String getName() {
      return "Monopoly: ";
   }
   void play() {
    System.out.println(getName() + "Buy all property" + punctuation);
   }
}
 
class Chess extends Game {
   String getName() {
    return "Chess: ";
   }
   void play() {
    System.out.println(getName() + "Kill the enemy king" + punctuation); 
   }
}
 
class Battleships extends Game {
   String getName() {
    return "Battleships: ";
   }
   void play() {
      System.out.println(getName() + "Sink all ships" + punctuation);
   }
}

    