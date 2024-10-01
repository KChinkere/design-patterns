package designpatterns.structural.decorator.example1;

public class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending email notification");
    }
}
