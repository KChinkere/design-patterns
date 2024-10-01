package designpatterns.structural.flyweight.example;

public class ConcreteFlyweight implements Flyweight {
    private final String intrinsic;

    public ConcreteFlyweight(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    @Override
    public void operation(String extrinsic) {
        System.out.println("Intrinsic state: " + intrinsic + ", Extrinsic state: " + extrinsic);
    }
}
