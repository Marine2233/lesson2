package transport;

public  class Transport {
    public String model;

    public Transport(String model) {
        this.model = model;
    }

    public  void move(){
        System.out.println( model + " едет по дороге");
    };
}
