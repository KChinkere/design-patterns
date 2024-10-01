package designpatterns.behavioral.observer.example;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
}
