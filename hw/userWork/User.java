package userWork;

public class User {

    private static int count;
    private String name;

    public User(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }


}
