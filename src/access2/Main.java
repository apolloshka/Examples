package access2;
import access.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName("Барсик");
        cat.setName("Рыжик");

        cat.color = "Рыжий";
//        cat.breed = "Британец";
//        cat.nickname = "Рыж";

        System.out.println("Цвет: " + cat.color);
//        System.out.println("Порода: " + cat.breed);
//        System.out.println("Прозвище: " + cat.nickname);
        System.out.println("Имя: " + cat.getName());    }
}
