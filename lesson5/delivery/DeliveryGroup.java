package delivery;

public class DeliveryGroup {
    public static void main(String[] args) {
         DeliveryManager manager = new DeliveryManager();
         manager.getDeliverys().add(new CourierDelivery(1,"ул. Лермонтова 7",200));
         manager.getDeliverys().add(new DroneDelivery(2,"ул. Красная 149",400));
         manager.getDeliverys().add(new PostDelivery(4,"ул. Роз 63",150));
         manager.getDeliverys().add(new PickupDelivery(3,"ул. Виноградная 99",0));

         manager.showAllDeliverys();
    }
}
