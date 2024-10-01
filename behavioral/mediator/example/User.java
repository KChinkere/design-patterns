package designpatterns.behavioral.mediator.example;

public abstract class User {
    protected Mediator mediator;
    protected String name;

    public User(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void send(String message);
    abstract void receive(String message);

    public String getName() {
        return name;
    }
}
