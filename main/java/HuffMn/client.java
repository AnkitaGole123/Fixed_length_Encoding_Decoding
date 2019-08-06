package HuffMn;
import java.util.List;

public class client {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        String input = "MyNameIsAnkita";
        Table table = new Table();
        List<String> encodingTable = encoder.encoding(input, table.generateTable());
        System.out.println(encodingTable);
        System.out.println(decoder.getDecoder(encodingTable, table.generateTable()));
    }
}
