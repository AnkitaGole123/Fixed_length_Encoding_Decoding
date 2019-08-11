package fixedLengthEncodingDecoding;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TableReader {
    public List<String> reader(String path) throws IOException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        return Collections.singletonList((sc.nextLine()));
    }
}
