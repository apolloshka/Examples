package arrays;

public class Cat extends Pet {
    public String breed;

    Cat(String name) {
        this(name, 0);
    }

    Cat(int age) {
        this(" ", age);
    }

    Cat(String name, int age) {
        super(name, age);
    }
}

