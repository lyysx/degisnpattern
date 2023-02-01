package structural.adapter.example;

/**
 * @author liuyangyang
 * @since 2023-02-01 22:00
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
