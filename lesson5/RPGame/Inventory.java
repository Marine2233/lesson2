package RPGame;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item>inventorys = new ArrayList<>();

    public void getWeigh(){
        double weigh = inventorys.stream().mapToDouble(Item::getWeight).sum();
        System.out.println("Общий вес " + weigh);
    }

    public void showItem(){
        System.out.println("Инвентарь:\n ");
        //inventorys.forEach(Item::show);
    }

    public void useAllItems(){
        inventorys.forEach(Item::use);
    }

    public ArrayList<Item> getInventorys() {
        return inventorys;
    }
}
