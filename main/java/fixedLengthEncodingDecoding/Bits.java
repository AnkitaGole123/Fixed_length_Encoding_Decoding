package fixedLengthEncodingDecoding;

class Bits {
    int getBites(Integer numberOfUniqueCharacter){
        for (int i = 0; i < numberOfUniqueCharacter; i++) {
            int pow= (int) Math.pow(2,i);
            if (numberOfUniqueCharacter < pow){
                return i;
            }
        }
     return 0;
    }
}
