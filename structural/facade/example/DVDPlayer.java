package designpatterns.structural.facade.example;

public class DVDPlayer {
    public void on() {
        System.out.println("DVD player on.");
    }

    public void off() {
        System.out.println("DVD player off.");
    }

    public void playing(String movie) {
        System.out.println("DVD player playing " + movie);
    }

}
