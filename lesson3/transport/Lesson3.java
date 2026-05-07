package transport;

import food.Burger;
import food.Pizza;
import food.Sushi;

public class Lesson3 {
    public static void main(String[] args) {
        Bike bike = new Bike(" Велосипед");
        Car care = new Car("Тайота");
        care.move();
        bike.move();



        Burger burger = new Burger("бургер",300,true);
        Pizza pizza = new Pizza("маргарита" , 700,"большая");
        Sushi sushi = new Sushi("креветка" , 800,8);
        sushi.addSauce();
        burger.pack();
        pizza.cook();
    }
}
