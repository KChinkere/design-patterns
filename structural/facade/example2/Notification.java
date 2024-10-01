package designpatterns.structural.facade.example2;

public class Notification {
    public void sendNotification(String customerName, String roomType) {
        System.out.println("Room booker for " + customerName + " in room type " + roomType);
    }
}
