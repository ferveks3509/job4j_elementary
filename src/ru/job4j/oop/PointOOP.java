package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class PointOOP {

    private int x;
    private int y;

    public PointOOP(int first, int second) { //для инициализации создадим конструктор.
        this.x = first;
        this.y = second;
    }

    public double distance(PointOOP that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.x - that.y, 2));
    }

    public static void main(String[] args) {
        PointOOP a = new PointOOP(0, 2);
        PointOOP b = new PointOOP(0, 0);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
