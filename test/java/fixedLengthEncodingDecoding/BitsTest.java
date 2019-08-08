package fixedLengthEncodingDecoding;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class BitsTest {
    @Test
    public void shouldGiveTheNumberOfBitsInWhichUniqueCharacterRepresent() throws IOException {
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        Bits bits =new Bits();
        int expected = 3;
        Integer numberOfUniqueCharacter = uniqueCharacter.countCharacter("ankita");
        assertEquals(expected,bits.getBites(numberOfUniqueCharacter));
    }
}
