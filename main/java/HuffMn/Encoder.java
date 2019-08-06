package HuffMn;
import java.util.ArrayList;
import java.util.List;

public class Encoder {
    public List<String> encoding(String input, List<String> table){
        List<String> encoderInput = new ArrayList<>();
        for (int i=0; i < input.length(); i++){
            encoderInput.add(table.get(input.charAt(i)));
        }
        return encoderInput;
    }
}
