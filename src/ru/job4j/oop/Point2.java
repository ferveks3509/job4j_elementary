package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point2 {
    private int x;
    private int y;

    public Point2(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point2 that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
            Point2 a = new Point2(0, 0);
            Point2 b = new Point2(0, 2);
            double dist = a.distance(b);
            System.out.println(dist);
    }

}
