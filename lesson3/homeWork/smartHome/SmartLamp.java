package homeWork.smartHome;

public class SmartLamp extends SmartHome implements ConnectionWiFi{

    String word;
    int num;
    long count;
    boolean flag;

    public SmartLamp(String word, String name){
        super(name);
        this.word = word;
    }

    public SmartLamp( String name,String word, int num){
        this(name,word);
        this.num = num;
    }

    public SmartLamp(String name,String word, int num,long count){
        this(name,word,num);
        this.count = count;
    }

    public SmartLamp(String name,String word, int num,long count,boolean flag){
        this(name,word,num,count);
        this.flag = flag;

    }




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
