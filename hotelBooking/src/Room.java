public class Room {

    private boolean availability;
    private float price;

    public Room(int roomNumber, int numberOfBeds) {
        String type = "Single";
        this.availability = true; // Available by default
        this.price = 50.0f; // Default price
    }


    public boolean isAvailable() {
        return availability;
    }

    public float getPrice() {
        return price;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}
