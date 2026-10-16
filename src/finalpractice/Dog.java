package finalpractice;

public class Dog extends Pet {

    public void makeSound() {
        System.out.println("Гав");
    }

//    public void eat() {
//        System.out.println("ест");
//    }

    public void eat(String food) {
        System.out.println("ест: " + food);
    }
}
