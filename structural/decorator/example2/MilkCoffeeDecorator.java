package designpatterns.structural.decorator.example2;

public class MilkCoffeeDecorator extends CoffeeDecorator {

    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk.";
    }

    @Override
    public double getCost() {
        return 7.50;
    }
}
