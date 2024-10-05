//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // new Room
        Room room1 = new Room(1, 1);

        // new Guest
        Guest guest1 = new Guest("John Doe", "sample@gmail.com", "1234567890");

        //check room availability
        System.out.println("Room availability: " + room1.isAvailable());

        // new Booking
        Booking booking1 = new Booking(new Room[]{room1}, guest1, "2021-01-01", "2021-01-03", "Confirmed", "Paid");

        // Add booking to guest
        guest1.addBooking(booking1);

        // Update booking status
        booking1.updateStatus("Cancelled");

    }
}