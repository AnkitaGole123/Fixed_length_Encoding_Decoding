package ReaderWriter;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    public String reader(String path) throws IOException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        return String.valueOf(sc.next());
    }
}
