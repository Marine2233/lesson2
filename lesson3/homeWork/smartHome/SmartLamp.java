package homeWork.smartHome;

public class SmartLamp extends SmartHome implements ConnectionWiFi{

    public SmartLamp(String name) {
        super(name);
    }

    @Override
    public void systemOn() {
        on = true;
        System.out.println(name + "включена.");

    }

    @Override
    public void systemOff() {
        on = false;
        System.out.println(name + " выключена.");

    }

    @Override
    public void connection() {
        System.out.println( name+ " подключена к WiFi");
    }
}
