package stringes;

public class Main {

    private static String lyrics = "Ó nincs a reggelhez jobb lábam\n" +
                "Ó nincs, a terhedhez nincs vállam\n" +
                "Ó nincs az esküvőhöz öltönyöm\n" +
                "Ó nincs a több pénzhez könyököm\n" +
                "Ó nincs, az életemnek nincs vége\n" +
                "Ó nincs a csajomnak humorérzéke\n" +
                "Ó nincs, ki a vicceken nevessen\n" +
                "Ó nincs, ki az eszemért szeressen";

    private static final String[] TABOO = {"nincs", "essen", "öm"};

    public static void main(String[] args) {
        Util util = new Util();
        System.out.println(util.replaceWords(lyrics, TABOO));
    }
}
