package designpatterns.behavioral.observer.example;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private List<Observer> observerList = new ArrayList<>();
    private float stockPrice;

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(stockPrice);
        }
    }

    public void setStockPrice(float stockPrice) {
        this.stockPrice = stockPrice;
        notifyObserver();
    }
}
