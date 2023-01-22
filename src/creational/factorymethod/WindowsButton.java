package creational.factorymethod;

/**
 * @author liuyangyang
 * @since 2023-01-11 23:02
 */
public class WindowsButton implements Button {
    @Override
    public void onClick(String s) {
        System.out.println("windows button:" + s);
    }

    @Override
    public void render() {
        System.out.println("windows button render");
    }
}
