package userWork;

public class User {
    public User(String name) {
        this.name = name;
        count++;
    }

    private String name;

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    private static int count;
}
