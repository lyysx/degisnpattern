package creational.bulider.example;

/**
 * @author liuyangyang
 * @since 2023-01-23 0:14
 */
public class Car {
    private final int seats;
    private final String engine;
    private final String tripComputer;
    private final String gps;

    public Car(int seats, String engine, String tripComputer, String gps) {

        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.gps = gps;
    }
}
