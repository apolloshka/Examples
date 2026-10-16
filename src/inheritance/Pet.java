package inheritance;

public class Pet {
    private String name;
    private int age;
    private String sound;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
//
//    public String newA(String name, int age){
//        return "1";
//    }
//
//    public int newA(int age, String name){
//        return 1;
//    }

    protected void setSound(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return this.sound;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
