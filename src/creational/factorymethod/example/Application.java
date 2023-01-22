package creational.factorymethod.example;

/**
 * @author liuyangyang
 * @since 2023-01-11 23:06
 */
public class Application {
    static Dialog dialog;

    public static void initialize(String type) throws Exception {
        if ("Windows".equals(type)) {
            dialog = new WindowsDialog();
        } else if ("Web".equals(type)) {
            dialog = new WebDialog();
        } else {
            throw new Exception("unknown type");
        }
    }

    public static void main(String[] args) throws Exception {
        initialize("Web");
        dialog.render();

    }
}
