package homeWork.character;

public class Warrior extends Character implements Attack{

    public Warrior(String name, String health, int lvl) {
        super(name, health, lvl);
        attack();
    }

    @Override
    public void attack() {
        System.out.println(name + " использует меч.\n");
    }
}
