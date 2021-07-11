import java.sql.SQLOutput;
import java.util.ArrayList;

public class Refrigator {
    ArrayList<Beer> beers = new ArrayList<Beer>();

    public void AddBeer(Beer beer) {
        if (beers.size() < 6){
            beers.add(beer);
            System.out.println("New beer(s) arrived.");
        } else {throw new IndexOutOfBoundsException();
        }
    }

    public Beer RemoveBeer() {
        if (beers.size() > 0) {
            int length = beers.size() - 1;
            Beer OutOfFridge = beers.get(length);
            beers.remove(length);
            return OutOfFridge;
        }
        else {throw new IndexOutOfBoundsException();
        }
    }


}
