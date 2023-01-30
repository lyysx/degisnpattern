package creational.prototype.example;

/**
 * @author liuyangyang
 * @since 2023-01-31 0:09
 */
public class Circle extends Shape {
    private int radius;
    public Circle() {

    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle circle) || !super.equals(obj)) {
            return false;
        }
        return circle.radius == radius;
    }
}
