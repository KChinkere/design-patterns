package designpatterns.behavioral.mediator.example;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        Mediator mediator = new ChatRoom();

        User user = new ChatUser(mediator, "Ajak");
        User user2 = new ChatUser(mediator, "Ikaris");
        User user3 = new ChatUser(mediator, "Sprite");
        User user4 = new ChatUser(mediator, "Thena");

        mediator.addUser(user);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user.send("Hello, everybody");
        user3.send("Hey, " + user.getName());
    }
}
