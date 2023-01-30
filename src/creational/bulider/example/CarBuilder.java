package creational.bulider.example;

/**
 * @author liuyangyang
 * @since 2023-01-23 0:16
 */
public class CarBuilder implements Builder {
    private int seats;
    private String engine;
    private String tripComputer;

    private String gps;

    public Car getResult() {
        return new Car(seats, engine, tripComputer, gps);
    }


    @Override
    public void reset() {

    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGps(String gps) {
        this.gps = gps;
    }
}
