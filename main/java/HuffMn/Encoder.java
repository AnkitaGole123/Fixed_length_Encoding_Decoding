package HuffMn;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.List;

public class Encoder {
    public List<Integer> encoding(String input, List<Integer> table){
        List<Integer> encoderInput = new ArrayList<>();
        for (int i=0; i < input.length(); i++){
            encoderInput.add(table.get((int) input.charAt(i)));
        }
        return encoderInput;
    }
}
