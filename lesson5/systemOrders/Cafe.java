package systemOrders;

import java.time.Duration;

public class Cafe {
    public static void main(String[] args) {
        Order order = new Order();
        order.getOrders().add(new HotDish("Борщ",380,Duration.ofMinutes(15)));
        order.getOrders().add(new Desert("Наполеон",280,"Банановый"));
        order.getOrders().add(new Drink("Глинтвейн",220,"сразу"));

        order.showOrder();
        System.out.println("Итого: "+order.calculateTotal());
    }
}
