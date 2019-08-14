package fixedLengthEncodingDecoding;

public class Bits {
     public int getBites(Integer numberOfUniqueCharacter) {
         for (int i = 0; i <= numberOfUniqueCharacter; i++) {
             int power = (int) Math.pow(2, i);
             if (power >numberOfUniqueCharacter) {
                 return i;
             }
         }
         return 0;
     }
}
