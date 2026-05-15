package RPGame;
//маг.арт
public abstract class MagicArtifact extends Item{
    private int lvl;

    public MagicArtifact(String name, String description, double weight) {
        super(name, description, weight);
        this.lvl = 2;
    }

    public int getLvl() {
        return lvl;
    }

    protected void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
