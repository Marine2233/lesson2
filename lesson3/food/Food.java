package food;

public class Food {
    public String name;
    public int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("Название: " + name + " \nцена: " + price );
    }
}
