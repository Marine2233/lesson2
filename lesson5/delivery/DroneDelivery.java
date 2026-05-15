package delivery;

public class DroneDelivery extends Delivery implements TrackDelivery{

    public DroneDelivery(int num, String address, double price) {
        super(num, address, price);
    }

    @Override
    public void trackDelivery() {
        System.out.println("Дрон в пути.");
    }

    @Override
    public int compareTo(Delivery o) {
        return this.getOrderName().compareTo(o.getOrderName());
    }
}
