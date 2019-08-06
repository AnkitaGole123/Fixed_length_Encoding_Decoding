package FixedLengthEncodingDecoding;

import java.util.ArrayList;
import java.util.List;

public class Table {
    public static List<String> table = new ArrayList<>();

    public List<String> generateTable() {
        for (int i = 0; i < 256; i++) {
            String binaryNumber = Integer.toBinaryString(i);
            StringBuilder fixed = new StringBuilder();
            for (int j = 0; j < 8-binaryNumber.length(); j++) {
                fixed.append("0");
            }
            fixed.append(binaryNumber);
            table.add(fixed.toString());
        }
        return table;
    }
}
