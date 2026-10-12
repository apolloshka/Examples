package staticpractice;

import static java.lang.Math.abs;


public class Dog {
    private String name;
    private int age;
    private static String shelterName;
    private static String description;
    private static int countDogs;

    public static class Statistics {

        public static void compareDogs(Dog first, Dog second) {
            int difference = abs(first.getAge() - second.getAge());

            System.out.println("Разница в возрасте: " + difference);
        }

        public static void printNumOfDogs() {
            System.out.println("Собачек посчитано: " + countDogs);
        }
    }

    static {
        System.out.println("Это статический блок, сейчас создадутся собачки и они будут жить в приюте");
        shelterName = "Приют";
        System.out.println("Название приюта будет изменено, пока пусть он именуется так: " + shelterName);
    }

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
        countDogs++;
    }

    public static void setShelterName(String shelterName) {
        Dog.shelterName = shelterName;
    }

    public static String getShelterName() {
        return shelterName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public static void setDescription(String description) {
        Dog.description = description;
    }

    public static void getDescription() {
        System.out.println(description);
    }

    public void getInfo() {
        System.out.println(name + "," + age + "," + getShelterName());
    }

}
