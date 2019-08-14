package fixedLengthEncodingDecoding;

import java.util.*;

public class BitsTable {
    public Map<Character, String> generateTable(int bit, Set uniqueCharacters) {
        Map<Character, String> bits = new HashMap<>();

        int bin = 0;
        for (Object word : uniqueCharacters) {
            char word1 = (char) word;
            String binaryNumber = Integer.toBinaryString(bin);
            StringBuilder fixed = new StringBuilder();
            for (int j = 0; j < bit - binaryNumber.length(); j++) {
                fixed.append("0");
            }
            fixed.append(binaryNumber);
            bits.put(word1, fixed.toString());
            bin += 1;

        }
        return bits;
    }

}
