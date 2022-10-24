import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VowelsTest {

    @Test
    void emptyTextTest() throws Exception {
        try {
            Vowels vowels = new Vowels("");
        }catch (Exception e){
            assertEquals(e.getMessage(), "The string is empty.");
        }
    }
    @Test
    void noOnePassPatternTest() throws Exception{
        try{
            Vowels vowels = new Vowels("got beer");
            vowels.splittingText();
        }catch (Exception e){
            assertEquals(e.getMessage(), "There`re no one word which pass the pattern.");
        }
    }

    @Test
    void twoLinesTest() throws Exception{
        Vowels vowels = new Vowels("is\nempty\ncode\nopium");
        vowels.splittingText();
        var list = vowels.getTextSplit();
        assertEquals(list.size(), 3);
    }

    @Test
    void onlyOneTest() throws Exception{
        Vowels vowels = new Vowels("is");
        vowels.splittingText();
        var list = vowels.getTextSplit();
        assertEquals(list.size(), 1);
    }

    @Test
    void firstAndSecondAreVowelTest() throws Exception{
        Vowels vowels = new Vowels("yeh lol own yield");
        vowels.splittingText();
        var list = vowels.getTextSplit();
        assertEquals(list.size(), 3);
    }
}