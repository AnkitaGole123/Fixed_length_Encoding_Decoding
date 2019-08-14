package fixedLengthEncodingDecoding;
import java.util.HashSet;

public class UniqueCharacter {
    public HashSet<Character> countCharacter(String demo){
        HashSet <Character> uniqueCharacter = new HashSet <Character>();
        for (int i = 1; i < demo.length(); i++) {
            uniqueCharacter.add(demo.charAt(i));
        }
        return uniqueCharacter;
    }
}
