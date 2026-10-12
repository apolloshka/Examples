package inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Рудольф", 3, 2.4);
        Cat cat = new Cat(" ", 5, "Рыжий");

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Что говорит собака?");
//        String dogSound = scanner.nextLine();
//        dog.setSound(dogSound);
//        System.out.println(dog.bark());
//
//        System.out.println("Что говорит кошка?");
//        String catSound = scanner.nextLine();
//        cat.setSound(catSound);
//        System.out.println(cat.meow());

//        cat.setSound("Мяу");
        System.out.println("1 — кот мяукает");
        System.out.println("2 — задать коту другой звук");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1){
            System.out.println(cat.meow());
        } else if (choice ==2){
            System.out.println("Введите новый звук:");
            String newSound = scanner.nextLine();
            cat.setSound(newSound);
            System.out.println("Кошка говорит" + cat.meow());
        } else {
            System.out.println("UNKNOWN");
        }

//        dog.name = "Рудольф";
//        dog.age = 3;
//        dog.weight = 2.4;

//        cat.setName("Рыжик");

//        System.out.println("Собака по имени " + dog.getName() + " возрастом " + dog.getAge() + " года весит " + dog.getWeight() + " кило" + " и говрит " + dog.bark());
//        System.out.print("Кот по имени " + cat.getName() + " говорит " + cat.meow());
    }
}
