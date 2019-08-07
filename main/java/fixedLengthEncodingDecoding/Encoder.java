package fixedLengthEncodingDecoding;

import java.util.List;
import java.util.Map;

public class Encoder {
    public String encode(String input, Map<Integer,String> table){
        StringBuilder encoderInput = new StringBuilder();
        for (int i=0; i < input.length(); i++){
            encoderInput.append(table.get((int)input.charAt(i)));
        }
        return encoderInput.toString();
    }
}
