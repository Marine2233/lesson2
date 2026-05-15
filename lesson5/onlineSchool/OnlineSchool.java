package onlineSchool;

public class OnlineSchool {
    public static void main(String[] args) {
        Student student = new Student("Maria","maria@ne.ya",18);
        Student student1 = new Student("Maria","maria@ne.ya",18);
        Course course = new Course("Java",new Teacher(
                "Иван","ivan@java.ya",32,"Java"));
        course.getStudents().add(student1);
        course.getStudents().add(student);
        course.showInfo();
    }
}
