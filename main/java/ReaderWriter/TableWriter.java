package ReaderWriter;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class TableWriter {
    public void writer(Map bitsTable) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        try {
            writer.writeValue(new File("/Users/ankita.gole/Documents/IdeaProjects/HuffMN/src/main/java/Outputs/Table.json"),
                    bitsTable);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
