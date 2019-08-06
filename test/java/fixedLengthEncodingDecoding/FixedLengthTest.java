package fixedLengthEncodingDecoding;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class FixedLengthTest {
    @Test
    public void itShouldEncodeStringInBinary(){
        String expected= "0100110101111001010011100110000101101101011001010100100101110011010000010110111001101011011010010111010001100001";
        Encoder encoder = new Encoder();
        Table table = new Table();
        String input = "MyNameIsAnkita";
        assertEquals(expected, encoder.encode(input, table.generateTable()));
    }
    @Test
    public void itShouldEncodeStringInBinaryAndReadingDataFromTextFile() throws IOException {
        String expected= "011000010110111001101011011010010111010001100001";
        Encoder encoder = new Encoder();
        Table table = new Table();
        FileReader fileReader = new FileReader();
        assertEquals(expected, encoder.encode(fileReader.reader(), table.generateTable()));
    }
    @Test
    public void itShouldEncodeStringInBinaryAndWritingDataFromTextFile() throws IOException {
        Encoder encoder = new Encoder();
        Table table = new Table();
        FileReader fileReader = new FileReader();
        fixedLengthEncodingDecoding.Writer fileWriter = new Writer();
        String encodingTable = String.valueOf(encoder.encode(fileReader.reader(), table.generateTable()));
        fileWriter.writer(encodingTable,"/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/Write");
        assertEquals(encodingTable, encoder.encode(fileReader.reader(), table.generateTable()));
    }
}
