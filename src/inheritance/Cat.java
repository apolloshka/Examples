package inheritance;

public class Cat extends Pet {
    private String breed;

    public Cat(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
        setSound("Мяу");
    }
    public String meow(){
        return getSound();
    }
}
