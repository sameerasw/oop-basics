public class AirDelivery extends EDelivery {

    public AirDelivery( String address, Integer cost) {
        super(address, cost);
    }

    @Override
    public void calculateCost(Integer cost) {
        System.out.println("Calculating cost for air delivery..." + (cost + 10));
    }
}
