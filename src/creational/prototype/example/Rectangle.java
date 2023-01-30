package creational.prototype.example;

import java.util.Objects;

/**
 * @author liuyangyang
 * @since 2023-01-31 0:12
 */
public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle rectangle) || !super.equals(obj)) {
            return false;
        }
        return rectangle.width == width && rectangle.height == height;
    }
}
