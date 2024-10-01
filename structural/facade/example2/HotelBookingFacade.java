package designpatterns.structural.facade.example2;

public class HotelBookingFacade {
    private CustomerRecord customerRecord;
    private RoomReservation roomReservation;
    private PaymentProcessing paymentProcessing;
    private Notification notification;

    public HotelBookingFacade(CustomerRecord customerRecord, RoomReservation roomReservation, PaymentProcessing paymentProcessing, Notification notification) {
        this.customerRecord = customerRecord;
        this.roomReservation = roomReservation;
        this.paymentProcessing = paymentProcessing;
        this.notification = notification;
    }

    public void bookRoom(String customerName, String roomType, String paymentType) {
        System.out.println("Booking room for " + customerName + ".....");
        customerRecord.createCustomerProfile(customerName);
        roomReservation.reserveRoom(roomType);
        paymentProcessing.processPayment(paymentType);
        notification.sendNotification(customerName, roomType);
        System.out.println("Booking completed....");

    }
}
