package designpatterns.structural.decorator.example2;

public class SugarCoffeeDecorator extends CoffeeDecorator {

    public SugarCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " & Sugar";
    }

    @Override
    public double getCost() {
        return 10.00;
    }
}
