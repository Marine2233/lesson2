package food;

public class Sushi extends Food{
    public int prices;

    public Sushi(String name, int price, int prices) {
        super(name, price);
        this.prices = prices;
    }

    public  void addSauce(){
        showInfo();
        System.out.println(name + "соус добавлен.");
    }

}
