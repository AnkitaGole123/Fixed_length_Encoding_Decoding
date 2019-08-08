package fixedLengthEncodingDecoding;

import java.util.Map;

public class Encoder {
    public byte[] encode(String input, Map<Integer,String> table){
        byte[] bytes = new byte[input.length()];
        for (int i=0; i < input.length(); i++){
            bytes[i] = Byte.parseByte((table.get((int)input.charAt(i))),2);
        }
        return bytes;
    }
}
