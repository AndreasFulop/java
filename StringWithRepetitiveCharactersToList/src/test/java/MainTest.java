import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    Main main = new Main();
    String codingResult;

    @Test
    public void testRepetitiveCharactersValids(){
        codingResult = "aacbb";
        assertEquals("aa,bb", main.repetitiveCharacters(codingResult));

        codingResult = "accbbr";
        assertEquals("cc,bb", main.repetitiveCharacters(codingResult));

        codingResult = "rtzaacbbatr";
        assertEquals("aa,bb", main.repetitiveCharacters(codingResult));

        codingResult = "aacfghjaacbnaadrt";
        assertEquals("aa,aa,aa", main.repetitiveCharacters(codingResult));
    }

    @Test
    public void testRepetitiveCharactersNonAlphabetic(){
        codingResult = "+.,;~<>** ,,5";
        assertEquals("**,,,", main.repetitiveCharacters(codingResult));
    }

    @Test
    public void testRepetitiveCharactersInvalid(){
        codingResult = null;
        assertThrows(IllegalArgumentException.class, () -> main.repetitiveCharacters(codingResult));
    }

    @Test
    public void testRepetitiveCharactersEmptyString(){
        codingResult = "";
        assertEquals("", main.repetitiveCharacters(codingResult));
    }

    @DisplayName("String with 101 characters")
    @Test
    public void testRepetitiveCharactersInvalidLength(){
        codingResult = "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890a";
        assertThrows(IllegalArgumentException.class, () -> main.repetitiveCharacters(codingResult));
    }

    @DisplayName("String with UTF-8")
    @Test
    public void testRepetitiveCharactersUTF8(){
        codingResult = "\u00f1"+"\u00ea"+"\u00ea"+"\u00ea"+"\u37f0"+"\u37f0";
        assertEquals("\u00ea"+"\u00ea"+"\u00ea"+","+"\u37f0"+"\u37f0", main.repetitiveCharacters(codingResult));
    }
}
