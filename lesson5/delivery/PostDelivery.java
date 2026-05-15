package delivery;

public class PostDelivery extends Delivery implements TrackDelivery{
    public PostDelivery(int num, String address, double price) {
        super(num, address, price);
    }

    @Override
    public void trackDelivery() {
        System.out.println("Заказ находится по адресу: " + getAddress());
    }

    @Override
    public int compareTo(Delivery o) {
        return this.getOrderName().compareTo(getOrderName());
    }
}
