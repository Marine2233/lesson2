import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


        HashMap<String,String> phoneBook = new HashMap<>();
        for (int i = 0; i <=10 ; i++){
            phoneBook.put("name" + i,"nums" + i);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("hjhvg");
        list.add("marine");
        list.add("java");
        list.add("developer");

        for (int i = 0; i < 5; i++) {
            new User("name" + i);
        }
        System.out.println(" строка 31 \n задание - тел. книга. \n"+User.getCount());


        Dog rich = new Dog();
        Cat perec = new Cat();
        System.out.println("стр. 35 - animal - package exampleAnimal\n "+perec.makeSound() + "\n" + rich.makeSound());

        System.out.println("стр. 37 - class Calculator");
        System.out.println(Calculator.max(1,2));
        System.out.println(Calculator.multiply(1,1,1));
        System.out.println(Calculator.sum(2,5,4));
        System.out.println("стр.41 ");
        System.out.println(HomeWork.findLongestWord( list));
    }
}
