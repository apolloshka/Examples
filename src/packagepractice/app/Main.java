package packagepractice.app;

import packagepractice.animals.Cat;
public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();

        cat.name = "Рыжик";
        cat.weight = 2.9;

        packagepractice.animals.Dog dog = new packagepractice.animals.Dog();

        dog.name = "Рудольф";
        dog.weight = 12;

        System.out.println("Имя кота: " + cat.name + " Вес кота: " + cat.weight);
        System.out.println("Имя собаки: " + dog.name + " Вес собаки: " + dog.weight);
    }
}
