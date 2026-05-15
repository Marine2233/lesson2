package delivery;

public abstract class Delivery implements Comparable<Delivery> {
    private String orderName = "Заказ  №";
    private int num;
    private String address;
    private double price;

    public Delivery(int num, String address, double price) {

        this.num = num;
        this.orderName+=num;
        this.address = address;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }

    public String getOrderName() {
        return orderName;
    }

    public int getNum() {
        return num;
    }
}
