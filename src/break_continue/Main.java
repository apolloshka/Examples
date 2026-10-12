package break_continue;

public class Main {
    public static void main(String[] args){
        int i = 0;
        while(true){
            if (i == 10){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Выход из цикла");

        for (int n = 0; n < 10; n++){
            if (n%2 == 0){
                continue;
            }
            System.out.println("Нечетное число:" + n);
        }
    }
}
