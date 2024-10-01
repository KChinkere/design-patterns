package designpatterns.structural.bridge.example;

public class BridgePatternExample {
    public static void main(String[] args) {
        Shape rasterCricleShape = new CricleShape(new RasterDrawingAPI(), 1.00, 2.00, 20);
        Shape vectorCircleShape = new CricleShape(new VectorDrawingAPI(), 1.0, 10.0, 50);
        Shape customCircleShape = new CricleShape(new CustomDrawingAPI(), 2.00, 10.00, 70);
        rasterCricleShape.draw();
        vectorCircleShape.draw();
        customCircleShape.draw();

    }
}
