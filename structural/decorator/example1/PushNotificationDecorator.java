package designpatterns.structural.decorator.example1;

public class PushNotificationDecorator extends NotificationDecorator {
    public PushNotificationDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sending push notification.");
    }
}
