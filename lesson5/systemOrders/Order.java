package systemOrders;

import java.util.ArrayList;

public class Order {
    private ArrayList<Dish> orders;

    public void showOrder(){
        orders.forEach(Dish::info);
    }

    public double calculateTotal(){
        return orders.stream().
                mapToDouble(Dish::getPrice).
                sum();
    }

    public Order() {
        orders = new ArrayList<>();
    }

    public ArrayList<Dish> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Dish> orders) {
        this.orders = orders;
    }
}
