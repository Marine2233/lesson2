package homeWork.delivery;

public class Сourier extends Delivery implements TrackOrder{
    public Сourier(String address, int price) {
        super(address, price);
        deliver();
        TrackOrder.trackOrder();
        System.out.println();
    }

    @Override
    public void deliver() {
        System.out.println("Доставка: курьером.");
    }
}
