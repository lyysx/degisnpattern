package creational.singleton.example;

/**
 * @author liuyangyang
 * @since 2023-01-31 23:55
 */
public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;
    private String value;

    private ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value) {
        ThreadSafeSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (ThreadSafeSingleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton(value);
            }
            return instance;
        }
    }
}
