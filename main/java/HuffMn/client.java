package HuffMn;

public class client {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        String input = "MyNameIsAnkita";
        System.out.println(encoder.encoding(input, Table.table));
    }
}
