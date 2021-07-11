import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    Main main = new Main();
    String codingResult;

    @Test
    public void testCoding(){
        codingResult = "aacbb";
        assertEquals("aa,bb", main.coding(codingResult));
    }

    @Test
    public void testCodingStrangeChars(){
        codingResult = "+.,; 5";
        assertEquals("There is nothing to print.", main.coding(codingResult));
    }

    @Test
    public void testCodingInvalid(){
        codingResult = null;
        assertThrows(IllegalArgumentException.class, () -> main.coding(codingResult));
    }

    @Test
    public void testCodingEmptyString(){
        codingResult = "";
        assertEquals("There is nothing to print.", main.coding(codingResult));
    }

    @DisplayName("String with 101 characters")
    @Test
    public void testCodingInvalidLength(){
        codingResult = "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890a";
        assertThrows(IllegalArgumentException.class, () -> main.coding(codingResult));
    }

    @DisplayName("String with UTF-8")
    @Test
    public void testCodingUTF8(){
        codingResult = "\u00f1"+"\u00ea"+"\u00ea"+"\u00ea"+"\u37f0"+"\u37f0";
        assertEquals("\u00ea"+"\u00ea"+"\u00ea"+","+"\u37f0"+"\u37f0", main.coding(codingResult));
    }
}
