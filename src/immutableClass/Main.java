package immutableClass;

public class Main {
    public static void main(String args[]) {
        int[] scores = {2, 4, 5};

        Student student = new Student("Петр", scores);

        scores[0] = 5;

        System.out.println("Исходный массив: ");
        for (int score : scores) {
            System.out.println(score);
        }

        System.out.println("Оценки студента: ");
        for (int score : student.getScores()) {
            System.out.println(score);
        }

        int[] copyScore = student.getScores();
        copyScore[2] = 1;

        System.out.println("Оценки студента после изменения: ");
        for (int scor : student.getScores()) {
            System.out.println(scor);
        }


        Address[] original = {new Address("Москва"), new Address("Питер")};
        Address[] UPcopy = original.clone(); //поверхностная копия

        UPcopy[0].setCity("Казань");
        System.out.println(original[0].getCity());
        System.out.println(UPcopy[0].getCity());


        Address[] DEEPcopy = new Address[original.length];

        for (int i = 0; i < original.length; i++) {
            DEEPcopy[i] = new Address(original[i].getCity());
        }

        DEEPcopy[0].setCity("Москва");

        System.out.println(original[0].getCity()); // Казань (ранее изменено через поверхностоное копирование)
        System.out.println(DEEPcopy[0].getCity());     // Москва

        Student student2 = new Student("Алина", new int[]{3, 5, 2});
        System.out.println("Оценки Алины: ");
        for (int score : student2.getScores()) {
            System.out.println(score);
        }

        int[] scoreStudent2 = student2.getScores();
        scoreStudent2[1] = 2;

        System.out.println("Оценки Алины в новом (внешнем) массиве: ");
        for (int score : scoreStudent2) {
            System.out.println(score);
        }

        System.out.println("Оценки Алины как объекта не поменялись: ");
        for (int score : student2.getScores()) {
            System.out.println(score);
        }

    }
}

//Без clone в get:
//Исходный массив:
//        5
//        4
//        5
//Оценки студента:
//        2
//        4
//        5
//Оценки студента после изменения:
//        2
//        4
//        1
//
//Без clone в конструкторе:
//Исходный массив:
//        5
//        4
//        5
//Оценки студента:
//        5
//        4
//        5
//Оценки студента после изменения:
//        5
//        4
//        5
//
//С clone():
// Исходный массив:
//        5
//        4
//        5
//Оценки студента:
//        2
//        4
//        5
//Оценки студента после изменения:
//        2
//        4
//        5
//
//Без clone():
//Исходный массив:
//        5
//        4
//        5
//Оценки студента:
//        5
//        4
//        5
//Оценки студента после изменения:
//        5
//        4
//        1