package creational.factorymethod.example;

/**
 * @author liuyangyang
 * @since 2023-01-11 23:04
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
