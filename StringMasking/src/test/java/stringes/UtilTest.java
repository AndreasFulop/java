package stringes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UtilTest {
    Util util;
    @BeforeEach
    public void setup(){
        util = new Util();
    }

    @Test
    public void testReplaceWordsNotValid() {
        String[] words = null;
        String lyrics = "...";
        assertThrows(IllegalArgumentException.class,() -> util.replaceWords(lyrics, words));
    }
    @DisplayName("Ez a neve a tesztnek.")
    @Test
    public void testReplaceWordsValid() {
        String[] words = {"nincs"};
        String lyrics = "Nincs semmi baj, nincs semmi gáz";
        assertEquals(util.replaceWords(lyrics, words), "Nincs semmi baj, ***** semmi gáz");
    }
}
