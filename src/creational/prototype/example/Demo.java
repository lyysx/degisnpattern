package creational.prototype.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyangyang
 * @since 2023-01-31 0:16
 */
public class Demo {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        List<Shape> shapeCopyList = new ArrayList<>();
        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        circle.setColor("red");
        shapeList.add(circle);
        Circle cloneCircle = (Circle) circle.clone();
        shapeList.add(cloneCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        rectangle.setColor("blue");
        shapeList.add(rectangle);
        cloneAndCompare(shapeList, shapeCopyList);
    }

    private static void cloneAndCompare(List<Shape> shapeList, List<Shape> shapeCopyList) {
        for (Shape shape : shapeList) {
            shapeCopyList.add(shape.clone());
        }

        for (int i = 0; i < shapeList.size(); i++) {
            if (shapeList.get(i) != shapeCopyList.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapeList.get(i).equals(shapeCopyList.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
