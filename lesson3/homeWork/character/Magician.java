package homeWork.character;
//маг
public class Magician extends Character implements Attack,Magic {

    public Magician(String name, String health, int lvl) {
        super(name, health, lvl);
        attack();
        useMagick();
    }

    @Override
    public void attack() {
        System.out.println(name +" использует магию.");
    }

    @Override
    public void useMagick() {
        System.out.println(name + " произносит заклинание.\n");
    }
}
