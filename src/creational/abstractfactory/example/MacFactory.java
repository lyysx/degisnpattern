package creational.abstractfactory.example;

/**
 * @author liuyangyang
 * @since 2023-01-22 21:30
 */
public class MacFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
