package fixedLengthEncodingDecoding;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class FileReader {
    public String reader() throws IOException
    {
        File file = new File("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/fixedLengthEncodingDecoding/ReadFile");
        Scanner sc = new Scanner(file);
        String input = sc.next();

        return input;
    }

}
