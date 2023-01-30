package creational.prototype.example;

import java.util.Objects;

/**
 * @author liuyangyang
 * @since 2023-01-31 0:02
 */
public abstract class Shape {
    protected int x;
    protected int y;

    protected String color;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape() {

    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }


    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape shape)) {
            return false;
        }
        return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
    }
}
