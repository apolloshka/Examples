package switchpractice;

import java.util.Scanner;

public class Switch {                              //замена множественных if
    public static void main(String[] args){
        Scanner scana = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = scana.nextInt();
        switch(age){
            case 0 :
                System.out.println("Новорожденный" + "Вам " + age + " лет");
            case 7 :
                System.out.println("Первоклассник" + "Вам " + age + " лет");
            case 18 :
                System.out.println("Выпускник" + "Вам " + age + " лет");
            default :
                System.out.println("Вам " + age + " лет");

        Scanner scann = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scann.nextLine();
        switch(name){
            case "Полина" :
                System.out.println("Вас зовут: " + name);
                break;
            case "Илья" :
                System.out.println("Вас зовут: " + name);
                break;
            default :
                System.out.println("Таких имён в перечне нет");
        }

        }
    }
}
