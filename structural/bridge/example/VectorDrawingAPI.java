package designpatterns.structural.bridge.example;

public class VectorDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Vector circle at (" + x +"," + y + ") with radius " + radius);
    }
}
