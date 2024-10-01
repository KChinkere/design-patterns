package designpatterns.structural.flyweight.example2;

public class Rectangle implements Shape {
    private final String color;

    public Rectangle(String color) {
        this.color = color;
    }

    @Override
    public void draw(double x, double y, String color) {
        System.out.println("Drawing rectangle at (" + x  + "," + y + ") with color " + color);
    }

    public String getColor() {
        return color;
    }
}
