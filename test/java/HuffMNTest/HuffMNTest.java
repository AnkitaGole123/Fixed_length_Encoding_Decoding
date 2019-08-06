package HuffMNTest;

import HuffMn.Decoder;
import HuffMn.Encoder;
import HuffMn.Table;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HuffMNTest {
    @Test
    public void itShouldReturnDeckName(){
        List<String> expected= Arrays.asList("01001101", "01111001", "01001110", "01100001", "01101101","01100101", "01001001", "01110011", "01000001", "01101110", "01101011", "01101001", "01110100", "01100001");
        Encoder encoder = new Encoder();
        Table table = new Table();
        String input = "MyNameIsAnkita";
        assertEquals(expected, encoder.encoding(input, table.generateTable()));
    }
}
