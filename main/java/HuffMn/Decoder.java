package HuffMn;

import java.util.List;

public class Decoder {
    String getDecoder(List<String> encodedData, List<String> table){
        StringBuilder decodedData = new StringBuilder();
        for (String encodedDatum : encodedData) {
            decodedData.append((char) table.indexOf(encodedDatum));
        }
        return decodedData.toString();
    }

}
