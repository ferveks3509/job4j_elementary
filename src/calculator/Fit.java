package calculator;

public class Fit {
    public static double manWeight(double heigth) {
        double rsl = 100 * 1.15;
        return rsl;
    }

    public static double woomanWeigth(double heigth) {
        double rsl = 110 * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(100);
        double wooman = Fit.woomanWeigth(100);
        System.out.println("Man 100 is " + man );
        System.out.println("wooman 100 is " + wooman);
    }
}
