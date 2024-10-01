package designpatterns.structural.decorator.example1;

public abstract class NotificationDecorator implements Notification {
    protected Notification wrapperNotification;

    NotificationDecorator(Notification notification) {
        this.wrapperNotification = notification;
    }

    @Override
    public void send() {
        this.wrapperNotification.send();
    }
}
