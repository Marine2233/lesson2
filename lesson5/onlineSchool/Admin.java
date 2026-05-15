package onlineSchool;

public class Admin extends User implements Auth{

    public Admin(String name, String mail, int age) {
        super(name, mail, age);
    }

    @Override
    public String auth() {
        return "Admin";
    }
}
