package access;

public class Cat {

    private String name;     //внутри класса
    public String color;     //отовсюду внутри проекта
    protected String breed;  //в пакете и наследниках
    String nickname;         //default - внутри пакета
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age; //с this - поле объекта кот, слправа - параметр метода
    }
}