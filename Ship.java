package lesson7;

import java.util.Random;

public class Ship {
    private int x;
    private int y;
    private int miLenght;
    boolean miIsHoriz;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int setY(int y) {
        this.y = y;
        return y;
    }

    public int getY() {
        return y;
    }

    public void setMiLenght(int miLenght) {
        this.miLenght = miLenght;
    }

    public int getMiLenght() {
        return miLenght;
    }
}
