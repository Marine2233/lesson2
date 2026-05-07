package homeWork.onlineSchool;

public class DesignerCourse extends Courses{
    public DesignerCourse(String name, String duration, String teacher) {
        super(name, duration, teacher);
    }

    @Override
    public void startOfTraining() {
        System.out.println("Обучение по курсу: "+name+"- стартовало.");
    }
}
