package fixedLengthEncodingDecoding;
import ReaderWriter.FileReader;
import ReaderWriter.TableWriter;
import ReaderWriter.Writer;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class client {

    public static void main(String[] args) throws IOException {
        ByteConvertor byteConvertor = new ByteConvertor();
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        Bits bits = new Bits();
        Encoder encoder = new Encoder();
        TableWriter tableWriter = new TableWriter();
        BitsTable bitsTable = new BitsTable();
        FileReader fileReader = new FileReader();
        Writer fileWriter = new Writer();
        String userInput = fileReader.reader("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/Outputs/ReadFile");
        Set uniqueCharactersSet = uniqueCharacter.countCharacter(userInput);
        int bit = bits.getBites(uniqueCharactersSet.size());
        Map<Character, String> bitTable = bitsTable.generateTable(bit, uniqueCharactersSet);
        tableWriter.writer(bitTable);

        List<Boolean> userInputEncoded = encoder.encode(userInput, bitTable);
        byte[] bytes = byteConvertor.toBytes(userInputEncoded);

        fileWriter.write(bytes, "/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/Outputs/EncodedData");
    }
}
