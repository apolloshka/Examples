package inheritance;

public class Dog extends Pet {
    private double weight;

    public Dog() {
        this("", 0, 0.0);
    }

    public Dog(String name) {
        this(name, 0, 0.0);
    }

    public Dog(String name, int age) {
        this(name, age, 0.0);
    }

    public Dog(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
        setSound("Гав");
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
