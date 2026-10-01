package packagepractice.app2;

import packagepractice.animals.*;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.name = "Барсик";

        Dog dog = new Dog();
        dog.name = "Серж";

        packagepractice.streetdog.Dog dog1 = new packagepractice.streetdog.Dog();
        dog1.name = "Инкогнито";

        System.out.println(cat.name);
        System.out.println(dog.name);
        System.out.println(dog1.name);

    }
}
