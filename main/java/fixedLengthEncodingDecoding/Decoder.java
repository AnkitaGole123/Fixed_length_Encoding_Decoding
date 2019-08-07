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
        String data = "";
        List<String> encoded = new ArrayList<>();
        for (int i = 0; i < encodedData.length(); i++) {
            data += encodedData.charAt(i);
            if (data.length() == 8) {
                encoded.add(data);
                data = "";
            }
        }return encoded;
    }

}
