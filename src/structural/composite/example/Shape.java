package structural.composite.example;

import java.awt.*;

/**
 * @author liuyangyang
 * @since 2023-02-02 0:08
 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}
