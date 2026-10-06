package inheritance;

import java.util.Scanner;
public class CommandMain {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Cat cat = null;
        Dog dog = null;

        boolean running = true;

        while (running){
            System.out.println("1 — создать кошку");
            System.out.println("2 — создать собаку");
            System.out.println("3 — создать имя кошки");
            System.out.println("4 — создать имя собаки");
            System.out.println("5 — задать возраст кошки");
            System.out.println("6 — задать возраст собаки");
            System.out.println("7 — показать данные кошки");
            System.out.println("8 — показать данные собаки");
            System.out.println("9 — Что говорит кошка?");
            System.out.println("10 — Что должна говорить кошка?");
            System.out.println("0 — выйти");
            System.out.println("Введите команду:");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command){
                case 1:
                    cat = new Cat("", 0, "");
                    System.out.println("Кошка создана");
                    break;

                case 2:
                    dog = new Dog("", 0, 0);
                    System.out.println("Собака создана");
                    break;

                case 3:
                    if (cat == null) {
                        System.out.println("Сначала создайте кошку командой 1");
                    } else {
                        System.out.println("Введите имя кошки:");
                        String name = scanner.nextLine();
                        cat.setName(name);
                        System.out.println("Имя сохранено");
                    }
                    break;

                case 4:
                    if (dog == null) {
                        System.out.println("Сначала создайте собаку командой 2");
                    } else {
                        System.out.println("Введите имя собаки:");
                        String name = scanner.nextLine();
                        dog.setName(name);
                        System.out.println("Имя сохранено");
                    }
                    break;

                case 5:
                    if (cat == null) {
                        System.out.println("Сначала создайте кошку командой 1");
                    } else {
                        System.out.println("Введите возраст кошки:");
                        int age = scanner.nextInt();
                        cat.setAge(age);
                        System.out.println("Возраст сохранен");
                    }
                    break;

                case 6:
                    if (dog == null) {
                        System.out.println("Сначала создайте собаку командой 2");
                    } else {
                        System.out.println("Введите возраст собаки:");
                        int age = scanner.nextInt();
                        dog.setAge(age);
                        System.out.println("Возраст сохранен");
                    }
                    break;

                case 7:
                    if (cat == null) {
                        System.out.println("Сначала создайте кошку командой 1");
                    } else {
                        System.out.println("Имя кошки: " + cat.getName());
                        System.out.println("Возраст кошки: " + cat.getAge());
                    }
                    break;

                case 8:
                    if (dog == null) {
                        System.out.println("Сначала создайте собаку командой 2");
                    } else {
                        if (dog.getName() != null){
                            System.out.println("Имя собаки: " + dog.getName());
                        }

                        if (dog.getAge() != 0){
                            System.out.println("Возраст собаки: " + dog.getAge());
                        }
                    }
                    break;

                case 9:
                    if (cat == null) {
                        System.out.println("Сначала создайте кошку командой 1");
                    } else {
                        System.out.println(cat.meow());
                    }
                    break;

                case 10:
                    if (cat == null) {
                        System.out.println("Сначала создайте кошку командой 1");
                    } else {
                        System.out.println("Введите новый звук кошки:");

                        String sound = scanner.nextLine();
                        cat.setSound(sound);

                        System.out.println("Звук сохранён");
                    }
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Неизвестная команда");
            }
        }
    }
}
