package arrays;

public class Dog extends Pet {
    public double weight;

    Dog(String name){
        this(name, 0);
    }

    Dog(int age){
        this(" ", age);
    }

    Dog(String name, int age){
        super(name, age);
    }


}

