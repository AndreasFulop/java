public class HomePub {
    public static void main(String[] args) {
        Refrigator fridge = new Refrigator();
        Man tibi = new Man();
        Woman marika = new Woman();
        System.out.println(tibi.Hair+" "+tibi.getHair()+" "+tibi.Teeth+" "+tibi.getTeeth());
        System.out.println(marika.getHair()+" "+marika.getTeeth());
        marika.setHair("Blonde");
        marika.setTeeth(31);
        System.out.println(marika.getHair()+" "+marika.getTeeth());

        /*
        Beer BV = new Beer(5, "Balatoni Világos");
        int i = 0;
        while (i<6){
            fridge.AddBeer(BV);
            i++;
        }
        */
    }
}
