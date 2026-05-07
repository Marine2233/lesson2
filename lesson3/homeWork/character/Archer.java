package homeWork.character;
//лучник
public class Archer extends Character implements Attack {

    public Archer(String name, String health, int lvl){
        super(name,health,lvl);
        attack();
    }
    @Override
    public void attack() {
        System.out.println(name + " использует лук.\n");

    }
}
