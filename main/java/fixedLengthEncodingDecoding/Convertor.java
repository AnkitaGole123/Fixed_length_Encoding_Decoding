package fixedLengthEncodingDecoding;

public class Convertor {
    public static String toBinary(String s){
        byte[] bytes = s.getBytes();

        System.err.println("byte[] bytes = ");
        for(byte b : bytes){
            System.err.println(b);
        }

        StringBuilder binary = new StringBuilder();
        for (byte b : bytes)
        {
            int val = b;
            for (int i = 0; i < 8; i++)
            {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        return binary.toString();
    }

}
