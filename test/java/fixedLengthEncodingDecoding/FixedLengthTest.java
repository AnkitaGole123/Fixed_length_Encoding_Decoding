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

}
