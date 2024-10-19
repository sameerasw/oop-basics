public class GroundDelivery extends EDelivery {

    public GroundDelivery( String address, Integer cost) {
        super(address, cost);
    }

    @Override
    public void calculateCost(Integer cost) {
        System.out.println("Calculating cost for ground delivery..." + (cost + 5));
    }
}
