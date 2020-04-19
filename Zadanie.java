package lesson1;

public class Zadanie {
    public static void main (String[] args) {
        int a1 = 21;
        int a2 = 54;
        int a3 = 56;
        int a4 = 97;

        int r1 = (a1 + a4) - (a2 - a3);
        double r2 = (double) (a2 * a3) / (a4 - a1);
        System.out.println("r1=" + r1);
        System.out.println("r2=" + r2);
        System.out.println("Расчет окончен");
    }
}
