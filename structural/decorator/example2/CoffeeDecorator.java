package designpatterns.structural.decorator.example2;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return this.decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return this.decoratedCoffee.getCost();
    }
}
