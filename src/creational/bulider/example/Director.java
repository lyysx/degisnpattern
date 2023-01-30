package creational.bulider.example;

/**
 * @author liuyangyang
 * @since 2023-01-30 23:48
 */
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setSeats(6);
        builder.setGps("Sports Gps");
        builder.setTripComputer("Sports Computer");
        builder.setEngine("Sports Engine");
    }

    public void constructCityCar(Builder builder) {
        builder.setEngine("City Engine");
        builder.setGps("City Gps");
        builder.setTripComputer("City Computer");
        builder.setSeats(4);
    }

    public void constructSuv(Builder builder) {
        builder.setSeats(8);
        builder.setGps("SUV Gps");
        builder.setEngine("SUV Engine");
        builder.setTripComputer("SUV Computer");
    }
}
