package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double heigth) {
        double rsl = (heigth - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(180);
        double woman = Fit.womanWeight(160);
        System.out.println("Man 180 is " + man );
        System.out.println("woman 160 is " + woman);
    }
}
