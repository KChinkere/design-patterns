package designpatterns.structural.flyweight.example;

public class FlyweightPatternExample {
    public static void main(String[] args) {
        FlyweightFactory flyweight = new FlyweightFactory();

        Flyweight flyweight1 = flyweight.getFlyweight("A");
        flyweight1.operation("Context1"); // Extrinsic state is passed

        Flyweight flyweight2 = flyweight.getFlyweight("B");
        flyweight2.operation("Context2"); // Extrinsic state is passed

        Flyweight flyweight3 = flyweight.getFlyweight("A"); // Reuse the flyweight
        flyweight3.operation("Context3");
        // Flyweight objects for "A" will be reused

    }
}
