package creational.factorymethod.example;

/**
 * @author liuyangyang
 * @since 2023-01-11 23:02
 */
public class HtmlButton implements Button {
    @Override
    public void onClick(String s) {
        System.out.println("html button:" + s);
    }

    @Override
    public void render() {
        System.out.println("html button render");
    }
}
