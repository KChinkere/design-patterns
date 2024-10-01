package designpatterns.structural.flyweight.example2;

public class Circle implements Shape{
    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(double x, double y, String color) {
        System.out.println("Drawing circle at (" + x  + "," + y + ") with color " + color);
    }

    public String getColor() {
        return color;
    }
}
