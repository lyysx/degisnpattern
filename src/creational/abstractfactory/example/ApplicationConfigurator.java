package creational.abstractfactory.example;


/**
 * @author liuyangyang
 * @since 2023-01-22 21:35
 */
public class ApplicationConfigurator {
    public static void main(String[] args) {
        GuiFactory factory = null;
        String type = "Windows";
        if ("Windows".equals(type)) {
            factory = new WinFactory();
        } else if ("Mac".equals(type)) {
            factory = new MacFactory();
        } else {
            throw new RuntimeException("error type");
        }
        Application application = new Application(factory);


    }
}
