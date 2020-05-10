package ru.job4j.oop;

import ru.job4j.oop.Point2;

public class Triangle2 {
    private Point2 first;
    private Point2 second;
    private Point2 third;

    public Triangle2(Point2 ap, Point2 bp, Point2 cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    public boolean exist(double ab, double ac, double bc) {
        boolean rsl = (ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac;
        return rsl;
    }

    public double period(double a, double b, double c) {
        double itog = (a + b + c) / 2;
        return itog;
    }

    public double area() {
        double rs1 = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rs1 = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rs1;
    }
}