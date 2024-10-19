public class DroneDelivery extends EDelivery {

    public DroneDelivery( String address, Integer cost) {
        super(address, cost);
    }

    @Override
    public void calculateCost(Integer cost) {
        System.out.println("Calculating cost for drone delivery..." + (cost + 3));
    }
}
