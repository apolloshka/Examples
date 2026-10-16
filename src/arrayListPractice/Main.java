package arrayListPractice;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> catList = new ArrayList<Cat>();

        Cat cat1 = new Cat("Барсик");
        catList.add(cat1);
        System.out.println(catList); //[Барсик]


        Cat cat2 = new Cat("Снежок");
        catList.add(1, cat2);
        System.out.println(catList); //[Барсик, Снежок]


        int theSize = catList.size();
        System.out.println(theSize); //2

        boolean isIn = catList.contains(cat2);
        System.out.println(isIn); //true

        int idx = catList.indexOf(cat2);
        System.out.println(idx); //1


        Cat catObject = catList.get(1);
        System.out.println(catObject); //Снежок


        boolean empty = catList.isEmpty();
        System.out.println(empty); //false

        catList.remove(cat2);
        System.out.println(catList); //[Барсик]

        Cat cat3 = new Cat("Пончик");
        catList.set(0, cat3);
        System.out.println(catList); //[Пончик]

        catList.remove(0);
        System.out.println(catList); //[]

        Cat cat4 = new Cat("Мими");
        Cat cat5 = new Cat("Нини");
        Cat cat6 = new Cat("Пини");

        catList.add(cat4);
        catList.add(cat5);
        catList.add(cat6);

        System.out.println(catList); //[Мими, Нини, Пини]


    }
}
