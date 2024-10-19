//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Delivery airDelivery = new AirDelivery("123 Main St", 100);
        airDelivery.calculateCost( 100 );
        airDelivery.trackProgress();

        Delivery droneDelivery = new DroneDelivery("456 Elm St", 200);
        droneDelivery.calculateCost( 200 );
        droneDelivery.trackProgress();

        Delivery groundDelivery = new GroundDelivery("789 Oak St", 300);
        groundDelivery.calculateCost( 300 );
        groundDelivery.trackProgress();

    }
}