package creational.abstractfactory.example;

/**
 * @author liuyangyang
 * @since 2023-01-22 21:29
 */
public class WinFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
