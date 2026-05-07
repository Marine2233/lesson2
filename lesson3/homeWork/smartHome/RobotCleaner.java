package homeWork.smartHome;

public class RobotCleaner extends SmartHome{

    public RobotCleaner(String name) {
        super(name);
    }

    @Override
    public void systemOn() {
        on = true;
        System.out.println(name + " включен.\nНачинает работу.");
    }

    @Override
    public void systemOff() {
        on = false;
        System.out.println(name + " выключен.");
    }
}
