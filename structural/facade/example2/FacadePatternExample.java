package designpatterns.structural.facade.example2;

public class FacadePatternExample {
    public static void main(String[] args) {
        var hotelBookingFacade = new HotelBookingFacade(new CustomerRecord(), new RoomReservation(), new PaymentProcessing(), new Notification());
        hotelBookingFacade.bookRoom("Uncle sam", "Deluxe Suite", "Apple Pay");
    }
}
