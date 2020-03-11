package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double heigth) {
        double rsl = (heigth - 100) * 1.15;
        return rsl;
    }

    public static double woomanWeigth(double heigth) {
        double rsl = (heigth - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(170);
        double wooman = Fit.woomanWeigth(170);
        System.out.println("Man 100 is " + man );
        System.out.println("wooman 100 is " + wooman);
    }
}
