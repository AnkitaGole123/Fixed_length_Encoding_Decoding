package fixedLengthEncodingDecoding;

import java.util.List;

public class Encoder {
    public String encode(String input, List<String> table){
        String encoderInput = "";
        for (int i=0; i < input.length(); i++){
            encoderInput+=table.get(input.charAt(i));
        }
        return encoderInput;
    }
}
