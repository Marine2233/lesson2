package delivery;

public class CourierDelivery extends Delivery implements TrackDelivery{
    private String name;
    public CourierDelivery(int num, String address, double price) {
        super(num, address, price);
        this.name = "Олег";
    }

    @Override
    public void trackDelivery() {
        System.out.println("Kурьер " + name + " скоро будет по адресу "+getAddress());
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Delivery o) {
        return this.getOrderName().compareTo(o.getOrderName());
    }
}
