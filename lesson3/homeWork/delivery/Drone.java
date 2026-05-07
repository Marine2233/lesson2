package homeWork.delivery;

public class Drone extends Delivery implements TrackOrder {

    public Drone(String address, int price) {
        super(address, price);
        deliver();
        TrackOrder.trackOrder();
        System.out.println();
    }

    @Override
    public void deliver() {
        System.out.println("Доставка дроном.");
    }

}
