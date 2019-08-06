package fixedLengthEncodingDecoding;

import java.util.ArrayList;
import java.util.List;

public class Decoder {
    String getDecoder(String encodedData, List<String> table){
        StringBuilder decodedData = new StringBuilder();
        List<String> decodeData = convertStringToList(encodedData);
        for (String encodedDatum : decodeData) {
            decodedData.append((char) table.indexOf(encodedDatum));
        }
        return decodedData.toString();
    }
    private List<String> convertStringToList(String encodedData) {
        String data = "";
        List<String> encoded = new ArrayList<>();
        for (int i = 0; i < encodedData.length(); i++) {
            data += encodedData.charAt(i);
            if (data.length() == 8) {
                encoded.add(data);
                data = "";
            }
        }
        return encoded;
    }
}
