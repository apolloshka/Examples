package staticpractice;

import static staticpractice.Dog.Statistics.compareDogs;
import static staticpractice.Dog.Statistics.printNumOfDogs;


public class Main {
    public static void main(String[] args) {

//        Dog.Statistics statistics = new Dog.Statistics();  методы статические, объект не нужен

        Dog.setShelterName("Приют2");

        Dog dog1 = new Dog("Барсик", 2);
        dog1.getInfo();

        Dog dog2 = new Dog("Шарик", 5);
        dog2.getInfo();


        compareDogs(dog1, dog2);
        printNumOfDogs();

        Dog.setDescription("Все питомцы в приюте");
        Dog.getDescription();
    }
}
