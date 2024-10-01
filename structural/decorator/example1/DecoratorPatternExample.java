package designpatterns.structural.decorator.example1;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Notification notification = new EmailNotification();

        notification = new SMSNotificationDecorator(notification);
        notification = new PushNotificationDecorator(notification);
        notification.send();

    }
}
