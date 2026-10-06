package access;

public class Cat {

    private String name;     //внутри класса
    public String color;     //отовсюду внутри проекта
    protected String breed;  //в пакете и наследниках
    String nickname;         //default - внутри пакета

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}