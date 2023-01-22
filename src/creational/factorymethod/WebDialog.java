package creational.factorymethod;

/**
 * @author liuyangyang
 * @since 2023-01-11 23:05
 */
public class WebDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
