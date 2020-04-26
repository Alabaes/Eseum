package lesson4;


import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args)
    /*{
        chek1(-11);
    }
    static int chek1(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " - четное");
            return a;
        } else {
            System.out.println(a + " - нечетное");
            return a;
        }
    }*/
    {
        System.out.println("Отгадай число от 0 до 10");
        chek2();
    }
        static void chek2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int r = (int) (Math.random()*10);
        while (true) {
            int a = scanner.nextInt();
            if (a == r) {
                System.out.println("Верно!");
                break;
            } else if (a > r) {
                System.out.println("Слишком большое");
            } else if (a < r) {
                System.out.println("Слишком маленькое");
            }
        }
    }
}

