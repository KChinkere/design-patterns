package designpatterns.behavioral.mediator.example;

public class ChatUser extends User {

    public ChatUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void send(String message) {
        System.out.println(this.name + " sends " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    void receive(String message) {
        System.out.println(this.name + " => " +"Received message :: " + message);
    }
}
