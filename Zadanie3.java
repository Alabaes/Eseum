package lesson3;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args)
    //Задача с делением на 5 без остатка:
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int n = scanner.nextInt();
        if (n%5==0) {
            System.out.println("Число делится на 5 без остатка");
        } else {
            System.out.println("Число не делится на 5 без остатка");
        }
        System.out.println("Поставленная задача завершена.");
    }
    //Введение кол-ва чисел, введение чисел, определение максимального из них и кол-ва нулей:
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите желаемое кол-во чисел: ");
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int z = 0;
        for (int i = 1; i<=n; i++) {
            System.out.print("Введите число: ");
            int a = scanner.nextInt();
            if (a == 0) {
                z++;
            }
            if (min > a) {
                min = a;
            }
            if (max < a) {
                max = a;
            }
        }
            System.out.println("Число нулей: " + z);
            System.out.println("Минимальное число: " + min);
            System.out.println("Максимальное число: " + max);
        }
        //Введение числа и определение максимальной и миниальной цифры в нем
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите натуральное число: ");
            int n = scanner.nextInt();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 1; i<=n; i++) {
                int a = n%10;
                if (max<a) {
                    max = a;
                }
                if (min>a) {
                    min = a;
                }
                n = n/10;
                System.out.println(n);
                if (n == 0) {
                    break;
                }
            }
            System.out.println("Максимальная цифра: " + max);
            System.out.println("Минимальная цифра: " + min);
        }
    }

