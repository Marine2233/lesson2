package homeWork.onlineSchool;

public abstract class Courses {
    public String name;
    public String duration;
    public String teacher;

    public Courses(String name, String duration, String teacher) {
        this.name = name;
        this.duration = duration;
        this.teacher = teacher;

    }

    public void info(){
        System.out.println("Курс: "+name+"\nПродолжительность: "+duration+"\nПреподаватель: "+teacher);
    }

    public abstract void  startOfTraining();
}
