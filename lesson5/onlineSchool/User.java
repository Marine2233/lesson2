package onlineSchool;

public abstract class User {
    private String name;
    private String mail;
    private int age;

    public User(String name, String mail, int age) {
        this.name = name;
        this.mail = mail;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public int getAge() {
        return age;
    }
}
