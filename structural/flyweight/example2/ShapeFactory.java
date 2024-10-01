package designpatterns.structural.flyweight.example2;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private Map<String, Shape> shapePool = new HashMap<>();

    public Shape getShapeByColorAndType(String color, ShapeType shapeType) {
        if(!shapePool.containsKey(color+shapeType)) {
            if(ShapeType.CIRCLE == shapeType) {
                shapePool.put(color+shapeType.name(), new Circle(color));
            } else {
                shapePool.put(color+shapeType.name(), new Rectangle(color));
            }
        }

        return shapePool.get(color+shapeType.name());
    }
}
