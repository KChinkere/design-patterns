package designpatterns.structural.facade.example;

public class SoundSystem {
    public void on() {
        System.out.println("Sound system on.");
    }

    public void off() {
        System.out.println("Sound system off.");
    }

    public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }
}
