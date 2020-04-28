package lesson5;

import java.util.Arrays;

public class Zadanie5 {
    public static void main(String[] args)
    /*{
        int[] a = {12, 8, 9, 0, -1, 7};
        System.out.println("a[] = " + Arrays.toString(a));
        System.out.println("max = " + max(a));
    }
    static int max(int[] a) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i <a.length; i++) {
            if (result < a[i]) {
                result = a[i];
            }
        }
        return result;
    }*/
    {
        int[] a = {1, 2, 8};
        int[] b = {1, 2, 8, 7};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
        System.out.println("равны: " + equals(a, b));
    }

        static boolean equals(int[] a, int[] b) {
            if (a == b) {
                return true;
            }
            int length = a.length;
            if (b.length != length) {
                return false;
            }
            for (int i=0; i<length; i++) {
                if (a[i] != b[i])
                    return false;
            }
            return true;
    }

}
