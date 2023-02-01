package structural.bridge.example;

/**
 * @author liuyangyang
 * @since 2023-02-01 23:33
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
