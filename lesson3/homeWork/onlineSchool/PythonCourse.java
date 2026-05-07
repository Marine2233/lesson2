package homeWork.onlineSchool;

public class PythonCourse extends Courses implements СertificateCourses{
    public PythonCourse(String name, String duration, String teacher) {
        super(name, duration, teacher);
    }

    @Override
    public void startOfTraining() {
        System.out.println("Обучение по курсу: "+name+"- стартовало.");
    }

    @Override
    public void certificate() {
        System.out.println("Сертификат выдан. ");
    }
}
