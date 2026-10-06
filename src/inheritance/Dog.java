package inheritance;

public class Dog extends Pet {
    private double weight;

    public String bark(){
        return getSound();
    }

    public double getWeight(){
        return this.weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public Dog(String name, int age, double weight){
        super(name, age);
        this.weight = weight;
        setSound("Гав");
    }
}
