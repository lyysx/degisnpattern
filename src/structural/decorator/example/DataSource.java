package structural.decorator.example;

/**
 * @author liuyangyang
 * @since 2023-02-02 0:30
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
