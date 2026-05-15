package onlineSchool;

import java.util.ArrayList;

public class Course {

    private String name;
    private Teacher teacher;
    private ArrayList<Student>students = new ArrayList<>();;

    public void showInfo(){
        System.out.println("Курс: " + name + "\nПреподаватель: " + teacher.getName() + "\nКол-во студентов: " + students.size());
    }

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
