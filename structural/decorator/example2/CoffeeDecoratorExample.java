package designpatterns.structural.decorator.example2;

public class CoffeeDecoratorExample {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
        coffee = new MilkCoffeeDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
        coffee = new SugarCoffeeDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

    }
}
