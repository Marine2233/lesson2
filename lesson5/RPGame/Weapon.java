package RPGame;
//оружие
public class Weapon extends  Item implements ImprovingItems{
    private int damage;

    public Weapon(String name, String description, double weight) {
        super(name, description, weight);
        this.damage = 20;
    }

    @Override
    public void use() {
        System.out.println(getName() + " наносит " + damage+" урона.");
    }

    @Override
    public void improving() {
        damage *= 2;

    }
}
