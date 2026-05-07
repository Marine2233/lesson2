package food;

public class Pizza extends Food{
    public  String size;

    public Pizza(String name, int price, String size) {
        super(name, price);
        this.size = size;
    }

    public  void cook(){
        showInfo();
        System.out.println(name + " готовится.");
    }

}
