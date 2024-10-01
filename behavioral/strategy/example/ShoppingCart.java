package designpatterns.behavioral.strategy.example;

public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        this.paymentStrategy.pay(amount);
    }
}
