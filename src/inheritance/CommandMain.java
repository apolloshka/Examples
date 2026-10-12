package inheritance;

import java.util.Scanner;

public class CommandMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("1 — создать животное");
            System.out.println("0 — выйти");
            System.out.println("Введите команду:");

            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1: {
                    System.out.println("Введите тип, имя и возраст питомца:");
                    System.out.println("Ожидаемый формат ввода: собака Шарик 4");
                    String input = scanner.nextLine();
                    String[] parts = input.trim().split("\\s+");
                    // trim() убирает пробелы в начале и конце строки,
                    // split("\\s+") разделяет строку по пробелам между словами и возвращает массив строк

                    switch (parts[0]) {
                        case "кошка": {
                            Cat cat = null;

                            switch (parts.length) {
                                case 1:
                                    cat = new Cat();
                                    break;
                                case 2:
                                    cat = new Cat(parts[1]);
                                    break;
                                case 3:
                                    int age = Integer.parseInt(parts[2]);
                                    cat = new Cat(parts[1], age);
                                    break;
                            }
                            System.out.println("Кошка создана");
                            System.out.println("Имя: " + cat.getName());
                            System.out.println("Возраст: " + cat.getAge());
                            System.out.println("Звук: " + cat.getSound());
                            break;
                        }

                        case "собака": {
                            Dog dog = null;

                            switch (parts.length) {
                                case 1:
                                    dog = new Dog();
                                    break;
                                case 2:
                                    dog = new Dog(parts[1]);
                                    break;
                                case 3:
                                    int age = Integer.parseInt(parts[2]);
                                    dog = new Dog(parts[1], age);
                                    break;
                            }
                            System.out.println("Собака создана");
                            System.out.println("Имя: " + dog.getName());
                            System.out.println("Возраст: " + dog.getAge());
                            System.out.println("Звук: " + dog.getSound());
                            break;
                        }

                        default:
                            System.out.println("Доступно для ввода два типа питомцев: кошки и собаки");
                    }
                    break;
                }

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Неизвестная команда");
            }
        }
    }
}
