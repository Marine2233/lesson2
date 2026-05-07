package food;

public class Burger extends Food{
    boolean spicy;

    public Burger(String name, int price, boolean spicy) {
        super(name, price);
        this.spicy = spicy;
    }

    public void pack(){
        showInfo();
        System.out.println(name + " упакован.");
    }

}
