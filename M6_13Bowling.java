import java.util.*; 

class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
      
    public void getWinner () {
/*        String[] nameArr = new String[players.size()];
        nameArr = players.keySet().toArray(nameArr);
        String[] pointArr = new String[players.size()];
        pointArr = players.values().toArray(pointArr);
        //from stackoverflow
        int[] numPointArr = Arrays.stream(pointArr).mapToInt(Integer::parseInt).toArray();
        int maximum = 0;
        for(int i:numPointArr) {
            if (i > maximum){
            maximum = i;
            }
        }
*/
        //System.out.println(pointArr);
        System.out.println(maximum);
    }
}

public class M6_13Bowling {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        sc.close();
        game.getWinner();
    }
}