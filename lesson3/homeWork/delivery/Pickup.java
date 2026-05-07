package homeWork.delivery;

public class Pickup extends Delivery {
    public Pickup(String address, int price) {
        super(address, price);
        deliver();
        System.out.println();
    }

    @Override
    public void deliver() {
        System.out.println("Доставка: самовывоз.");
    }
}
