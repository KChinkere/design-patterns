package designpatterns.structural.flyweight.example2;

public class ShapeFlyweightDesignPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        var circleShape1 = shapeFactory.getShapeByColorAndType("Blue", ShapeType.CIRCLE);
        circleShape1.draw(1.0, 10.0, "Blue");

        var circleShape2 = shapeFactory.getShapeByColorAndType("Red", ShapeType.RECTANGLE);
        circleShape2.draw(2.0, 20.0, "Red");

        var circleShape3 = shapeFactory.getShapeByColorAndType("Blue", ShapeType.CIRCLE);
        circleShape3.draw(3.0, 40.0, "Blue");
    }
}
