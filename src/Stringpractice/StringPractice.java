package Stringpractice;

public class StringPractice {
    public static void main(String[] args) {
        String first = "Java";
        String second = "Java";
        String third = new String("Java");

        System.out.println(first == second); //true
        System.out.println(first == third); //false
        System.out.println(third == second); //false

        System.out.println(first.equals(third)); //true
        System.out.println(second.equals(third)); //true
        System.out.println(third.equals(second)); //true

        //содержимое одинаково, все хеши одинаковы
        System.out.println(first.hashCode());
        System.out.println(second.hashCode());
        System.out.println(third.hashCode());

        String string = "Стринг";

        System.out.println(string);
        System.out.println(string.hashCode());

        String upperString = string.toUpperCase(); //создан новый объект,
        // присвоится ссылочной переменной upperString
        System.out.println(upperString);
        System.out.println(upperString.hashCode()); //1205826863

        System.out.println(string.equals(upperString)); //одинаковое содержимое - false
        System.out.println(string == upperString); // разные объекты - false

        string = string.toUpperCase(); //создан новый объект
        // класса String, перменная-ссылка string стала
        // ссылаться на новый объект а не поменяла свое состояние
        System.out.println(string);
        System.out.println(string.hashCode()); //1205826863

        System.out.println(string.equals(upperString)); //одинаковое содержимое - true
        System.out.println(string == upperString); //переменные ссылаются на развные объекты - false

    }
}
