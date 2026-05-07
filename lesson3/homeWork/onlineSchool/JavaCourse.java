package homeWork.onlineSchool;

import java.security.cert.Certificate;

public class JavaCourse extends Courses implements СertificateCourses {

    public JavaCourse(String name, String duration, String teacher) {
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
