package creational.abstractfactory.example;

/**
 * @author liuyangyang
 * @since 2023-01-22 21:31
 */


public class Application {

    private GuiFactory factory;
    private Button button;

    public Application(GuiFactory factory) {
        this.factory = factory;
        createUi();
    }

    private void createUi() {
        this.button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }
}


