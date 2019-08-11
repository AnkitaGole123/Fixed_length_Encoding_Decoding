package fixedLengthEncodingDecoding;


import java.util.ArrayList;
import java.util.List;

public class BitsTable {
    public List<String> generateTable(Integer countCharacter) {
        List<String> table = new ArrayList<>();
        Bits bits = new Bits();
        for (int i = 0; i < countCharacter; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            StringBuilder fixed = new StringBuilder();
            int binary = bits.getBites(5) - binaryNumber.length();
            for (int j = 0; j < binary; j++) {
                fixed.append("0");
            }
            fixed.append(binaryNumber);
            table.add(fixed.toString());
        }
        return table;
    }
}
