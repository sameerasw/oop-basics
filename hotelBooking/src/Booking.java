public class Booking {
    private Guest guest;
    private final String startDate;
    private String endDate;
    private String status;
    private String paymentStatus;
    private Room [] rooms;

    public Booking(Room[] rooms, Guest guest, String startDate, String endDate, String status, String paymentStatus){
        this.rooms = rooms;
        this.guest = guest;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.paymentStatus = paymentStatus;

        for (Room room : rooms) {
            room.setAvailability(false);
        }

        System.out.println("Booking created successfully!");
    }

    public Guest getGuest() {
        return guest;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStatus() {
        return status;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void updateEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void updateStatus(String status) {
        this.status = status;
        System.out.println("Booking status updated to: " + status);
    }

    public void updatePaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void endBooking() {
        for (Room room : rooms) {
            room.setAvailability(true);
        }
        updateStatus("Ended");
    }
}
