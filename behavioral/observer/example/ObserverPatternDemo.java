package designpatterns.behavioral.observer.example;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Stock googleStock = new Stock();

        Investor investor1 = new Investor("Ajak");
        Investor investor2 = new Investor("Ikaris");

        googleStock.attach(investor1);
        googleStock.attach(investor2);

        googleStock.setStockPrice(100.0f);
        googleStock.setStockPrice(110.0f);

        googleStock.detach(investor2);

        googleStock.setStockPrice(200.0f);
    }
}
