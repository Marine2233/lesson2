package homeWork.character;
/*Задача 1. Система игровых персонажей

Необходимо создать:
общий абстрактный класс персонажа;
несколько дочерних классов персонажей;
интерфейс для магических способностей.
В программе должны присутствовать:
поля;
конструкторы;
переопределение методов;
использование наследования;
использование интерфейсов;
вывод информации о действиях персонажей.
*/
public abstract class Character {
    public String name;
    public String health;
    public int lvl;

    public Character(String name, String health, int lvl){
        this.name = name;
        this.health = health;
        this.lvl = lvl;
        showInfo();
    }

    private void showInfo(){
        System.out.println("Персонаж: " + name + "\nЗдоровье: "+ health + "\nУровень: " + lvl);
    };

}
