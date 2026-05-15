package delivery;

public class PickupDelivery extends Delivery implements TrackDelivery{
    public PickupDelivery(int num, String address, double price) {
        super(num, address, price);
    }

    @Override
    public void trackDelivery() {
        System.out.println("Заказ можно забирать по адресу: " + getAddress());
    }

    @Override
    public int compareTo(Delivery o) {
        return this.getOrderName().compareTo(o.getOrderName());
    }
}
