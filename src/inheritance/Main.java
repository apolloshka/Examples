package inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.name = "Рудольф";
        dog.age = 3;
        dog.weight = 2.4;

        cat.name = "Рыжик";
        cat.color = "Рыжий";

        System.out.println("Собака по имени " + dog.name + " возрастом " + dog.age + " года весит " + dog.weight + " кило" + " и говрит " + dog.bark());
        System.out.print("Кот по имени " + cat.name + " говорит ");
        cat.meow();
        System.out.print("А еще он " + cat.color);

    }
}
