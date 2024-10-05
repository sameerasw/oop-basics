public class Guest {
    private String name;
    private String email;
    private String phoneNumber;
    private Booking[] bookings;

    public Guest(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Booking[] getBookings() {
        return bookings;
    }

    public void updateInfo(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void addBooking(Booking booking) {
        if (bookings == null) {
            bookings = new Booking[1];
            bookings[0] = booking;
        } else {
            Booking[] newBookings = new Booking[bookings.length + 1];
            for (int i = 0; i < bookings.length; i++) {
                newBookings[i] = bookings[i];
            }
            newBookings[bookings.length] = booking;
            bookings = newBookings;
        }
        System.out.println("Booking added successfully!");
    }


}
