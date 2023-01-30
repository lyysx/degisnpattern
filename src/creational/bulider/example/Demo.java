package creational.bulider.example;

/**
 * @author liuyangyang
 * @since 2023-01-30 23:53
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);
        Car cityCar = builder.getResult();

    }
}
