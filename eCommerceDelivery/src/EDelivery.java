public class EDelivery implements Delivery {

    protected String address;
    protected Integer cost;

    public EDelivery( String address, Integer cost) {
        this.address = address;
        this.cost = cost;
    }

    @Override
    public void calculateCost(Integer cost) {
        System.out.println("Calculating cost for e-delivery..." + cost);
    }

    public void trackProgress() {
        System.out.println("Tracking progress for e-delivery..." + this.address);
    }


}
