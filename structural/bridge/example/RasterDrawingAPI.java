package designpatterns.structural.bridge.example;

public class RasterDrawingAPI implements DrawingAPI {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.println("Raster circle at (" + x + "," + y + ") with radius " + radius);
    }
}
