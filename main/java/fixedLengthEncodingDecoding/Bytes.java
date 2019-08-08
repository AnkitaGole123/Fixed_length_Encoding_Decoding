package fixedLengthEncodingDecoding;

public class Bytes {
    int getBytes() {
        UniqueCharacter uniqueCharacter = new UniqueCharacter();
        Integer numberOfUniqueCharacter = uniqueCharacter.countCharacter("ankita");
        for (int i = 1; i < numberOfUniqueCharacter; i++) {
            int pow = (int) Math.pow(2, i);
            if (numberOfUniqueCharacter < pow) {
                return pow;
            }
        }
        return 0;
    }
}
