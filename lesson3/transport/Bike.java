package transport;

public class Bike extends Transport {
    public Bike(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println(model + "едет по вело-дороге");
    }

    @Override
    public String toString() {
        return "transport.Bike{}";
    }
}
