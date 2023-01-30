package creational.bulider.example;

/**
 * @author liuyangyang
 * @since 2023-01-23 0:14
 */
public interface Builder {
    void reset();

    void setSeats(int seats);

    void setEngine(String engine);

    void setTripComputer(String tripComputer);

    void setGps(String gps);
}
