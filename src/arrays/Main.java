package arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        Dog[] dogs = new Dog[5];
        Pet[] pets = new Pet[5];

        Cat cat = new Cat();
        cat.name = "Рыжик";

        Dog dog = new Dog();
        dog.name = "Рудольф";
        dog.weight = 2.4;

        cats[0] = cat;
        dogs[0] = dog;

// необходимо наследование
//        pets[0] = cats[0];
//        pets[1] = dogs[0];

        cats[1] = new Cat();
        cats[1].name = "Серж";
        cats[1].breed = "порода1";

        pets[2] = new Pet();
        pets[2].name = "Инкогнито";

        pets[3] = new Pet();
        pets[3].name = pets[2].name;
        pets[3].name = "Барсик";
        pets[4] = new Pet();
        pets[4] = pets[2];

        for (int i = 0; i < cats.length; i++){
            if (cats[i] != null) {
                System.out.println("Существует кошка по имени " + cats[i].name + " в массиве Cat");
            }
        }
        for (int i = 0; i < dogs.length; i++){
            if (dogs[i] != null) {
                System.out.println("Существует собака по имени " + dogs[i].name + " в массиве Dog");
            }
        }
        for (int i = 0; i < pets.length; i++){
            if (pets[i] != null){
                System.out.println("Питомец по имени " + pets[i].name + " сущеуствует в массиве Pet");
            }
        }

        int count = 0;
        for (int i = 0; i < cats.length; i++){
            if (cats[i] != null){
                count++;
            }
        }
        System.out.println("Количество питомцев в массиве Сat = " + count);
    }
}
