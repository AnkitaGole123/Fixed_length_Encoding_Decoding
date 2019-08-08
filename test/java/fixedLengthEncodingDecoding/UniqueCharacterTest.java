package fixedLengthEncodingDecoding;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UniqueCharacterTest {
    @Test
    public void shouldGiveTheNumberOfUniqueCharacter(){
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        String actual = "ankita";
        Integer expected = 5;
        assertEquals(expected,uniqueCharacter.countCharacter(actual));
    }
}
