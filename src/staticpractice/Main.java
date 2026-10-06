package staticpractice;

public class Main {
    public static void main(String[] args){
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name ="Барсик";
        dog2.name ="Шарик";

        Dog.shelterName = "Приют2";
//        Dog.isStreet = true; //по дефолту false, даже если не задано значение в static

        if (Dog.isStreet == true){
            System.out.println(dog1.name + " из приюта " + Dog.shelterName + " и он дворовый пес");
            System.out.println(dog2.name + " из приюта " + Dog.shelterName + " и он дворовый пес");
        }
        else{
            System.out.println(dog1.name + " из приюта " + Dog.shelterName + " и он не дворовый пес");
            System.out.println(dog2.name + " из приюта " + Dog.shelterName + " и он не дворовый пес");
        }
    }
}
