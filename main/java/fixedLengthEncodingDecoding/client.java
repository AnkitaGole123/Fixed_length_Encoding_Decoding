package fixedLengthEncodingDecoding;
import java.io.IOException;

public class client {
    public static void main(String[] args) throws IOException {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        FileReader fileReader = new FileReader();
        Table table = new Table();
        Writer fileWriter = new Writer();
        String encodingTable = String.valueOf(encoder.encode(fileReader.reader(), table.generateTable()));
        fileWriter.write(encodingTable,"/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/Write");
        System.out.println(encodingTable);
        System.out.println(decoder.getDecodedData(encodingTable, table.generateTable()));
    }
}
