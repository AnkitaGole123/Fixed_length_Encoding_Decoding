package fixedLengthEncodingDecoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ByteConverter {
    public byte[] toBytes(List<Boolean> encodedBits) {
        List<Byte> bytes = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (Boolean bool : encodedBits) {
            if(bool.equals(true)){
                temp.append(1);
            }else {
                temp.append(0);
            }
            if(temp.length()==8){
                bytes.add((byte) Integer.parseInt(temp.substring(2), 2));
                temp = new StringBuilder();
            }
        }

        bytes.add((byte) Integer.parseInt(temp.toString(), 2));
        System.out.println(Arrays.toString(getBinaryArray(bytes)));
        return getBinaryArray(bytes);

    }
    private byte[] getBinaryArray(List<Byte> bytes){
        int i = 0;
        byte[] bytesArray = new byte[bytes.size()];
        for (Byte bits :bytes) {
             bytesArray[i] = bits;
             i = i +1;
        }
        return bytesArray;
    }
}
