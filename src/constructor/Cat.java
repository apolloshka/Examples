package constructor;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age){
        System.out.println("Создан кот, возраст которого известен");
        this.name = name;
        this.age = age;
    }

    public Cat(String name){
        System.out.println("Создан кот, возраст которого не известен");
        this.name = name;
    }

    public Cat(){
        System.out.println("Создан кот, ни имени, ни возраста которого неизвестно");
        name = "Без имени";
    }

    public void introduce(){
        System.out.println("Кот " + name + " возраста: " + age);
    }
}
