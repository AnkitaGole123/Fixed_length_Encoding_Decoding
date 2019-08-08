package fixedLengthEncodingDecoding;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class UniqueCharacterTest {
    @Test
    public void shouldGiveTheNumberOfUniqueCharacter() throws IOException {
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        String actual = "ankita";
        Integer expected = 5;
        assertEquals(expected,uniqueCharacter.countCharacter(actual));
    }
}
