package systemOrders;

public class Drink extends Dish {
    private String supply;
    public Drink(String name, double price,String supply) {
        super(name, price);
        this.supply = supply;
    }

    @Override
    public void info() {
        System.out.println("Напиток: " + getName() + "\nцена: " + getPrice()+"\nподача: "+ supply + "\n");
    }

}
