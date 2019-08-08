package fixedLengthEncodingDecoding;
import java.io.IOException;
import java.util.Arrays;

public class client {
    public static void main(String[] args) throws IOException {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        FileReader fileReader = new FileReader();
        Table table = new Table();
        Writer fileWriter = new Writer();
        byte[] encodingTable = encoder.encode(fileReader.reader(), table.generateUpperBinaryTable());
        fileWriter.write(encodingTable,"/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/Write");
        System.out.println(Arrays.toString(encodingTable));
//        System.out.println(decoder.getDecodedData(encodingTable, table.generateTable()));
    }
}
