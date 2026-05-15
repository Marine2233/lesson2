package systemOrders;

public abstract class Dish {

private String name;
private double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void info();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
