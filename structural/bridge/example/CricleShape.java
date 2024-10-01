package designpatterns.structural.bridge.example;

public class CricleShape extends Shape {

    double x, y, radius;

    public CricleShape(DrawingAPI drawingAPI, double x, double y, double radius) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    @Override
    public void resizeByPercentage(double prctg) {
        radius *= (1.0 + prctg /100.0);
    }
}
