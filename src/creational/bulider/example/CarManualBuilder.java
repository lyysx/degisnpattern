package creational.bulider.example;

/**
 * @author liuyangyang
 * @since 2023-01-30 23:45
 */
public class CarManualBuilder implements Builder {
    private int seats;
    private String engine;
    private String tripComputer;

    private String gps;

    public Manual getResult() {
        return new Manual(seats, engine, tripComputer, gps);
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
