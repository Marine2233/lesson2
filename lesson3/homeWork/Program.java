package homeWork;

import homeWork.character.Archer;
import homeWork.character.Magician;
import homeWork.character.Warrior;
import homeWork.delivery.Drone;
import homeWork.delivery.Pickup;
import homeWork.delivery.Сourier;
import homeWork.onlineSchool.DesignerCourse;
import homeWork.onlineSchool.JavaCourse;
import homeWork.onlineSchool.PythonCourse;
import homeWork.smartHome.RobotCleaner;
import homeWork.smartHome.SmartLamp;
import homeWork.smartHome.SmartTV;

public class Program {
    public static void main(String[] args) {
//        Archer archer = new Archer("Homer","5",2);
//        Magician alice = new Magician("Alice","8", 9);
//        Warrior valera = new Warrior("Valera", "3",2);
//
//        System.out.println();
//
//        Drone drone = new Drone("Московская;41",500);
//        Сourier сourier = new Сourier("Лермонтова;7",300);
//        Pickup pickup = new Pickup("Красная 115",0);
//
//        System.out.println();

        JavaCourse javaCourse = new JavaCourse("Java", "120","Ivan P.");
        PythonCourse pythonCourse = new PythonCourse("Py","80","Kirill N.");
        DesignerCourse designerCourse = new DesignerCourse("Design","30","Olga K.");

        javaCourse.info();
        javaCourse.startOfTraining();
        javaCourse.certificate();

        System.out.println();

        pythonCourse.info();
        pythonCourse.startOfTraining();
        pythonCourse.certificate();

        System.out.println();

        designerCourse.info();
        designerCourse.startOfTraining();

        System.out.println();

        RobotCleaner cleaner =new RobotCleaner("робот-пылесос");
        SmartLamp lamp = new SmartLamp("Лампа-х101");
        SmartTV tv = new SmartTV( "tv ");

        cleaner.systemOn();
        cleaner.systemOff();

        System.out.println();

        lamp.connection();
        lamp.systemOn();
        lamp.systemOff();

        System.out.println();

        tv.connection();
        tv.systemOn();
        tv.systemOff();

    }
}
