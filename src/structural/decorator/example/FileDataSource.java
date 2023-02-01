package structural.decorator.example;

import java.io.*;

/**
 * @author liuyangyang
 * @since 2023-02-02 0:30
 */
public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream os = new FileOutputStream(file)){
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new String(buffer);
    }
}
