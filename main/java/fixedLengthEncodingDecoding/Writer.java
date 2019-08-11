package fixedLengthEncodingDecoding;

import java.io.*;
import java.util.List;

public class Writer {
    public void write(byte[] encodedData, String path) {
        File file = new File(path);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(encodedData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
