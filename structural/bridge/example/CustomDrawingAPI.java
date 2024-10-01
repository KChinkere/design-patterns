package designpatterns.structural.bridge.example;

public class CustomDrawingAPI implements DrawingAPI {

    public CustomDrawingAPI() {
    }

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Custom circle at (" + x + "," + y + ") with radius " + radius);
    }
}
