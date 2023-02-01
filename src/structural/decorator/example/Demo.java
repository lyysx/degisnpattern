package structural.decorator.example;

/**
 * @author liuyangyang
 * @since 2023-02-02 0:40
 */
public class Demo {
    public static void main(String[] args) {
        String str = "hello world";
        String path = "out/OutputDemo.txt";
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource(path)));
        encoded.writeData(str);
        FileDataSource plain = new FileDataSource(path);

        System.out.println("- Input ----------------");
        System.out.println(str);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
