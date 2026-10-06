package hashpractice;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Барсик");
        System.out.println(cat.hashCode());
        cat.setName("Не Брасик");
        System.out.println(cat.hashCode());

        Cat anotherCat = cat;
        System.out.println(anotherCat == cat); //проверка того, один ли это объект выполняет "=="

        Cat secondCat = new Cat("Барсик");
        System.out.println(secondCat.hashCode()); //может быть одинаков как для ссылки на предыдущую кошку - коллизия, так проверять некорректно
    }
}
