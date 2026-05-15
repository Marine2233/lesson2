package RPGame;
//броня
public class Armor extends Item implements ImprovingItems{
    private int  protection;


    public Armor(String name, String description, double weight ) {
        super(name, description, weight);
        this.protection = 40;
    }

    @Override
    public void use() {
        System.out.println( getName() + " дает " +  protection + " защиты." );
    }

    @Override
    public void improving() {
        protection += protection * 2;
    }

    public int getProtection() {
        return protection;
    }
}
