package fixedLengthEncodingDecoding;

import ReaderWriter.FileReader;
import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FixedLengthTest {
    @Test
    public void itShouldEncodeStringInBinaryAndReadingDataFromTextFile() throws IOException {
        String expected= "ankita";
        FileReader fileReader = new FileReader();
        assertEquals(expected, fileReader.reader("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/Outputs/ReadFile"));
    }
}
