package creational.abstractfactory.example;

/**
 * @author liuyangyang
 * @since 2023-01-22 21:26
 */
public class WinCheckBox implements CheckBox {
    @Override
    public void patin() {
        System.out.println("windows checkBox 渲染");
    }
}
