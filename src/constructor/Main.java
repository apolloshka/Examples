package constructor;

public class Main {
    public static void main(String[] args){
        Cat cat1 = new Cat("Барсик", 4);
        cat1.introduce();

        Cat cat2 = new Cat("Рыжик");
        cat2.introduce();

        Cat cat3 = new Cat();
        cat3.introduce();

        Dog dog1 = new Dog("Шарик", -1, true);

        Dog dog2 = new Dog("Рудольф", 4);
        Dog dog3 = new Dog ();

        dog1.introduce();
        dog2.introduce();
        dog2.setName("Бобик");
        dog2.getName();
        dog2.introduce();

        dog3.introduce();
        dog3.vaccinate(); //прививаем
        dog3.introduce();
    }
}
