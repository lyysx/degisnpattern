package structural.decorator.example;

/**
 * @author liuyangyang
 * @since 2023-02-02 0:34
 */
public class DataSourceDecorator implements DataSource{
    private DataSource wrapper;

    public DataSourceDecorator(DataSource wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }
}
