package fixedLengthEncodingDecoding;
import java.util.Map;
class Key {
   int getKey(String value, Map<Integer, String> table) {
        int key = 0;
        if (table.containsValue(value)) {
            for (Map.Entry<Integer, String> entry : table.entrySet()) {
                if (table.get(key).equals(value)) {
                }
            }
        }return key;
    }
}
