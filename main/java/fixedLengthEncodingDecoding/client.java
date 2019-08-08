package fixedLengthEncodingDecoding;

import java.io.IOException;
public class client {

    public static void main(String[] args) throws IOException {
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();
        FileReader fileReader = new FileReader();
        System.out.println(uniqueCharacter.countCharacter(fileReader.reader("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/ReadFile")));
        Table table = new Table();
        Writer fileWriter = new Writer();
        byte[] encodingTable = encoder.encode(fileReader.reader("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/ReadFile"), table.generateUpperBinaryTable());
        fileWriter.write(encodingTable, "/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/Write");
        System.out.println(fileReader.reader("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/Write"));
    }
}
