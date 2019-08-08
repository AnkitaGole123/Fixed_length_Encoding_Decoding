package fixedLengthEncodingDecoding;

import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FixedLengthTest {
    @Test
    public void itShouldEncodeStringInBinaryAndReadingDataFromTextFile() throws IOException {
        String expected= "ankita";
        FileReader fileReader = new FileReader();
        assertEquals(expected, fileReader.reader("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/ReadFile"));
    }
    @Test
    public void stringShouldEncodedInBinary() throws IOException {
        String expected = "ANKITA";
        Encoder encoder = new Encoder();
        Table table = new Table();
        FileReader fileReade = new FileReader();
        Writer writer = new Writer();
        String userInput =fileReade.reader("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/ReadFile");
        byte[] encoded = encoder.encode(userInput, table.generateUpperBinaryTable());
        writer.write(encoded, "/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/Write");
        String actual = fileReade.reader("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/Write");
        assertEquals(expected, actual);
    }
    @Test public void shouldGiveTheNumberOfUniqueCharacter() throws IOException {
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        FileReader fileReader = new FileReader();
        Integer expected = 5;
        assertEquals(expected,uniqueCharacter.countCharacter(fileReader.reader("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/Write")));
    }
    @Test public void shouldGiveTheNumberOfBitsInWhichUniqueCharacterRepresent() throws IOException {
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        Bits bits =new Bits();
        FileReader fileReader = new FileReader();
        int expected = 3;
        Integer numberOfUniqueCharacter = uniqueCharacter.countCharacter(fileReader.reader("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/Write"));
        assertEquals(expected,bits.getBites(numberOfUniqueCharacter));
    }
}
