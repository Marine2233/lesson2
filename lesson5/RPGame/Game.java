package RPGame;

public class Game {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        inventory.getInventorys().add(new Weapon("Меч самурая","богатырская",1.85));
        inventory.getInventorys().add(new Potion("Зелье похмелья","старинный рецепт",0.2));
        inventory.getInventorys().add(new Armor("Cтальная броня ","древний",275));

        inventory.showItem();
        inventory.useAllItems();
        inventory.getWeigh();
    }
}
