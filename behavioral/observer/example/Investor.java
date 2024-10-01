package designpatterns.behavioral.observer.example;

import java.util.Objects;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(float stockPrice) {
        System.out.println(this.name+ " has been notified of stock price update to " + stockPrice);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Investor investor = (Investor) o;
        return name.equals(investor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
