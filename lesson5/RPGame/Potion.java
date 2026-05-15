package RPGame;
//зелье
public class Potion extends MagicArtifact implements ImprovingItems{
    private int health;

    public Potion(String name, String description, double weight) {
        super(name, description, weight);
        this.health = 30;
    }

    @Override
    public void use() {
        System.out.println(getName() + " восстанавливает " + health + " здоровья.");
    }

    @Override
    public void improving() {
        setLvl(getLvl()*2);
    }
}
