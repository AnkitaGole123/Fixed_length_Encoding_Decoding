package fixedLengthEncodingDecoding;

import java.io.*;



public class Writer {
    public void write(String encodedData, String path) {
        File filePath = new File(path);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(encodedData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
