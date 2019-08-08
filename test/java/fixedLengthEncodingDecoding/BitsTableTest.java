package fixedLengthEncodingDecoding;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class BitsTableTest {
    @Test public void itShouldGiveBinaryTableInParticularBits(){
        BitsTable bitsTable= new BitsTable();
        UniqueCharacter uniqueCharacter=new UniqueCharacter();
        List<String>expected= Arrays.asList("000", "001", "010", "011", "100");
        assertEquals(expected,bitsTable.generateTable(uniqueCharacter.countCharacter("ankita")));
    }
}
