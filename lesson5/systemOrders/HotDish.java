package systemOrders;

import java.time.Duration;

public class HotDish extends Dish {
    private Duration cookingTime;

    public HotDish(String name, double price,Duration cookingTime) {
        super(name, price);
        this.cookingTime = cookingTime;
    }

    @Override
    public void info() {
        long minutes = cookingTime.toMinutes();
        System.out.println("Горячее: " + getName() + "\nцена: " + getPrice() +"\nвремя ожидания: " +minutes+ "мин.\n");
    }

    public Duration getCookingTime() {
        return cookingTime;
    }
}
