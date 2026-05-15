package onlineSchool;

public class Student extends User implements Auth{
    public Student(String name, String mail, int age) {
        super(name, mail, age);
    }

    @Override
    public String auth() {
        return "Student";
    }
}
