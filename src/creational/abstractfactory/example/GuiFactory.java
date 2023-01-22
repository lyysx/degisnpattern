package creational.abstractfactory.example;

/**
 * @author liuyangyang
 * @since 2023-01-22 21:23
 */
public interface GuiFactory {
    Button createButton();

    CheckBox createCheckBox();
}
