package creational.abstractfactory.example;

/**
 * @author liuyangyang
 * @since 2023-01-22 21:25
 */
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("mac button 渲染");
    }
}
