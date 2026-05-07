package homeWork.smartHome;

public class SmartTV extends SmartHome implements ConnectionWiFi{
    public SmartTV(String name) {
        super(name);
    }

    @Override
    public void systemOn() {
        on = true;
        System.out.println(name + " включен.");
    }

    @Override
    public void systemOff() {
        on = false;
        System.out.println(name + " выключен.");

    }

    @Override
    public void connection() {
        System.out.println( name+ " подключен к WiFi");

    }
}
