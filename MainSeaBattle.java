package lesson7;

import java.util.Random;

public class MainSeaBattle {
    static final int SIZE = 9;
    static final char SEA_CHAR = '~';
    static final char SHIP_CHAR = 'o';


    public static void main(String[] args) {
        Random random = new Random();

        char[] [] compSea = new char[SIZE][SIZE];
        initSea(compSea);

        //добавление точки
        int[] miTestPoint = {1, 1};
        addMiPointToSea(compSea, miTestPoint);

        //добавление корабля через класс
        int[] miShipPoint = {4, 4};
        addMiShipToSea(compSea, miShipPoint);

        /*
        //начальная точка
        int[] point = {4, 4};
        //длина
        int lenght = random.nextInt(4) + 1;
        //флаг: горизонтальная ориентация (иначе вертикальная)
        boolean isHoriz = random.nextBoolean();
        addShipToSea(compSea, point, lenght, isHoriz);
        addShipToSea(compSea, new int[] {3, 2}, 2, true);
        */

        printSea("Корабли противника", compSea);

        /*
        //поиск корабля
        int[] testPoint = {3, 2};
        System.out.println("Статус хода: " + isSuccessPoint(compSea, testPoint));
         */
    }

    private static void addMiPointToSea(char[][] sea, int[] p) {
        Ship miPoint = new Ship();
        miPoint.setX(p[0]);//x = p[0];
        miPoint.setY(p[1]);//y = p[1];
        sea [miPoint.getY()] [miPoint.getX()] = SHIP_CHAR;
    }

    //введение моего корабля
    private static void addMiShipToSea(char[][] sea, int[] miShipPoint) {
        Random random = new Random();
        Ship miShip = new Ship();
        miShip.setX(miShipPoint[0]);
        miShip.setY(miShipPoint[1]);
        miShip.setMiLenght(random.nextInt(4) + 1);
        miShip.miIsHoriz = random.nextBoolean();//гетер на тип boolean не создается, почему?
        if (miShip.miIsHoriz) {
            for (int j = 0; j < miShip.getMiLenght(); j++) {
                sea[miShip.getY()] [miShip.getX() + j] = SHIP_CHAR;
            }
        } else {
            for (int i = 0; i < miShip.getMiLenght(); i++) {
                sea[miShip.getY() + i] [miShip.getX()] = SHIP_CHAR;
            }
        }
    }

    private static boolean isSuccessPoint(char[][] sea, int[] testPoint) {
        int x = testPoint[0];
        int y = testPoint[1];
//        if (sea[y] [x] == SHIP_CHAR) {
//            return true;
//        } else {
//            return false;
//        }
        return sea[y] [x] == SHIP_CHAR;
    }

    private static void addShipToSea(char[][] sea, int[] point, int lenght, boolean isHoriz) {

        int x = point[0];
        int y = point[1];
        if (isHoriz) {
            for (int j = 0; j < lenght; j++) {
                sea[y] [x + j] = SHIP_CHAR;
            }
        } else {
            for (int i = 0; i < lenght; i++) {
                sea[y + i] [x] = SHIP_CHAR;
            }
        }
    }

    private static void printSea(String title, char[][] sea) {
        System.out.println(title);

        System.out.print("  ");
        for (int i = 0; i < sea.length; i++) {
            System.out.print((char) ('a' + i));
        }
        System.out.println();

        for (int i = 0; i<sea.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j<sea[i].length; j++) {
                System.out.print(sea[i] [j]);
            }
            System.out.println();
        }
    }

    private static void initSea(char[][] sea) {
        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea[i].length; j++) {
                sea[i] [j] = SEA_CHAR;
            }
        }
    }
}
