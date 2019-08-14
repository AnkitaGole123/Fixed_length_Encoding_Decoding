package fixedLengthEncodingDecoding;

import java.util.ArrayList;
import java.util.List;

public class ByteConvertor {
    public byte[] toBytes(List<Boolean> encodedBits) {
        List<Byte> bytes = new ArrayList<>();
        StringBuilder temp = new StringBuilder("0b");
        for (Boolean bool : encodedBits) {
            if(bool.equals(true)){
                temp.append(1);
            }else {
                temp.append(0);
            }
            if(temp.length()==10){
                bytes.add((byte) Integer.parseInt(temp.substring(2), 2));
                temp = new StringBuilder("0b");
            }
        }
        for (int i = 0; i < 10 - temp.length(); i++) {
            temp.append("0");
            bytes.add((byte) Integer.parseInt(temp.substring(2), 2));
        }
        System.out.println(bytes);
        return new byte[bytes.size()];

    }
}
