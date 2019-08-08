package fixedLengthEncodingDecoding;

import java.util.HashMap;
import java.util.Map;

public class BitsTable {

    public  Map<Integer,String> generateTable() {
        Map<Integer,String> table = new HashMap<>();
        Bits bits = new Bits();
        Bytes bytes = new Bytes();
        for (int i = 0; i < bytes.getBytes(); i++) {
            String binaryNumber = Integer.toBinaryString(i);
            StringBuilder fixed = new StringBuilder();
            int binary = bits.getBites(5) - binaryNumber.length();
            for (int j = 0; j < binary; j++) {
                fixed.append("0");
            }
            fixed.append(binaryNumber);
            table.put(i,fixed.toString());
        }
        return table;
    }
}
