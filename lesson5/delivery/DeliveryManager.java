package delivery;

import java.util.TreeSet;

public class DeliveryManager {
    private TreeSet<Delivery> deliverys = new TreeSet<>();

    public void showAllDeliverys(){
        System.out.println("Список доставок: \n");
        deliverys.stream().forEach(s-> System.out.println(s.getOrderName() + "\nАдрес: " + s.getAddress() + "\nСтоимость: "+s.getPrice()));
    }

    public TreeSet<Delivery> getDeliverys() {
        return deliverys;
    }
}
