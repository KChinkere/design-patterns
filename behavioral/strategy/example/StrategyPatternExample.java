package designpatterns.behavioral.strategy.example;

public class StrategyPatternExample {

    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("12321");
        PaymentStrategy payPalPayment = new PayPalPayment("asdas@asd.com");

        ShoppingCart checkoutUsingCC = new ShoppingCart(creditCardPayment);
        ShoppingCart checkoutUsingPP = new ShoppingCart(payPalPayment);

        checkoutUsingCC.checkout(1232);
        checkoutUsingPP.checkout(12342);
    }
}
