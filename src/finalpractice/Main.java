package finalpractice;

public class Main {
    public static void main(String[] args) {
        int num = 10;
        num = 11;
        System.out.println(num);

        final int count = 20;
//      count = 30; ошибка компиляции

        Test test1 = new Test(6);
        Test test2 = new Test(5);
        Test test3 = new Test();


        System.out.println(test1.getConstant()); // 6
        System.out.println(test2.getConstant()); // 5
        System.out.println(test3.getConstant()); // 0

        System.out.println(Test.getType());  // Кошки

        Dog dog = new Dog();

        dog.eat();          // метод Pet
        dog.eat("корм");    // перегруженный метод
        dog.makeSound();    // переопределённый метод

    }
}
