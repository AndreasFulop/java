package stringes;

public class Util {
    public String replaceWords(String toModify, String[] words){
        if (words == null)
            throw new IllegalArgumentException();
        for (String i:words) {
            int wordLength = i.length();
            String stars = "";
            for (int j = 0; j < wordLength; j++) {
                stars += "*";
            }
            toModify = toModify.replaceAll(i, stars);
        }
        return toModify;
    }
}
