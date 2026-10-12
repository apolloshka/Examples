package inputpractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in); //System.in - поток входных данных
        System.out.println("Введите заметку на сегодня");
        String string = name.nextLine();
        System.out.println("В планах: " + string);
    }
}
