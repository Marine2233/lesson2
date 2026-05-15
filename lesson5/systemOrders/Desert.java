package systemOrders;

public class Desert extends Dish {
    private String taste;

    public Desert(String name, double price,String taste) {
        super(name, price);
        this.taste = taste;
    }

    @Override
    public void info() {
        System.out.println("Десерт: " + getName() + "\nцена: " + getPrice()+"\nвкус: "+ taste + "\n");
    }

}
