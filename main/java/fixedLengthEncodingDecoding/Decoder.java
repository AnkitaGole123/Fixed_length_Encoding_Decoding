package fixedLengthEncodingDecoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Decoder {
    Key key = new Key();
    String getDecodedData(String encodedData, Map<Integer, String> table) {
        StringBuilder decodedData = new StringBuilder();
        List<String> decodeData = convertStringToList(encodedData);
        for (String encodedDatum : decodeData) {
            decodedData.append((char) key.getKey(encodedDatum, table));
        }
        return decodedData.toString();
    }
    private List<String> convertStringToList(String encodedData) {
        StringBuilder data = new StringBuilder();
        List<String> encoded = new ArrayList<>();
        for (int i = 0; i < encodedData.length(); i++) {
            data.append(encodedData.charAt(i));
            if (data.length() == 8) {
                encoded.add(data.toString());
                data = new StringBuilder();
            }
        }return encoded;
    }

}
