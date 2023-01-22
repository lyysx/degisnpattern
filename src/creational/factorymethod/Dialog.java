package creational.factorymethod;

/**
 * @author liuyangyang
 * @since 2023-01-11 22:59
 */
public abstract class Dialog {
    public abstract Button createButton();

    public void render() {
        Button button = createButton();
        button.onClick("add event");
        button.render();
    }
}
