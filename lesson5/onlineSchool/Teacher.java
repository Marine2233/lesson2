package onlineSchool;

public class Teacher extends User implements Auth{
    private String nameCourse;

    public Teacher(String name, String mail, int age,String nameCourse) {
        super(name, mail, age);
        this.nameCourse = nameCourse;
    }

    @Override
    public String auth() {
        return "Teacher";
    }
}
