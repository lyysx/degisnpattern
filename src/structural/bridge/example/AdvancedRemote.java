package structural.bridge.example;

/**
 * @author liuyangyang
 * @since 2023-02-01 23:39
 */
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
