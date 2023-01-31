package creational.singleton.example;

/**
 * @author liuyangyang
 * @since 2023-01-31 23:40
 */
public final class MultiThreadSingleton {
    private static MultiThreadSingleton instance;
    private String value;

    private MultiThreadSingleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static MultiThreadSingleton getInstance(String value) {
        if (instance == null) {
            instance = new MultiThreadSingleton(value);
        }
        return instance;
    }

}
