package designpatterns.structural.decorator.example1;

public class SMSNotificationDecorator extends NotificationDecorator {
    public SMSNotificationDecorator(Notification wrapperNotificationDecorator) {
        super(wrapperNotificationDecorator);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Sending SMS notification.");
    }
}
