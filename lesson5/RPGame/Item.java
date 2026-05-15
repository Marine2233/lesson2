package RPGame;

public abstract class Item {
    private String name;
    private String description;
    private double weight;

    public Item(String name, String description, double weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }


    public abstract void use();
    public void show(){
        System.out.println(name + " " + description);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }
}
