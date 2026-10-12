package inheritance;

public class Cat extends Pet {
    private String breed;

    public Cat() {
        this("", 0, "");
    }

    public Cat(String name) {
        this(name, 0, "");
    }

    public Cat(String name, int age) {
        this(name, age, "");
    }

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        setSound("Мяу");
    }
}
