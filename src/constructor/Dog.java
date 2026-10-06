package constructor;

public class Dog {
    private String name;
    private int age;
    private boolean vaccinated;

    public Dog(String name, int age, boolean vaccinated){
        this.name = name;
        if (age < 0){
            this.age = 0;
        } else{
            this.age = age;
        }
        this.vaccinated = vaccinated;
    }


    public Dog(){
        this("Без имени", 0, false);
    }

    public Dog(String name, int age){
        this(name, age, false);
    }

//    public Dog(){
//        name = "Без имени";
//    }
//
//    public Dog(String name, int age){
//        this.name = name;
//        if (age < 0){
//            this.age = 0;
//        } else{
//            this.age = age;
//        }
//    }

    public void introduce(){
        if (vaccinated == true){
            System.out.println("Собака " + name + " возраста: " + age + " привита");
        } else{
            System.out.println("Собака " + name + " возраста: " + age + " не привита");
        }
    }

    public void vaccinate() {
        vaccinated = true;
    }

    public String getName(){
        System.out.println("Имя собаки поменялось на: " + name);
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
