package ru.job4j.converter;

/**
 * Класс для конвертации валюты
 *
 * @author Ilya shirakov
 */
public class Converter {
    /**
     *
     * @param value кол-во рублей в евро
     * @return кол-во евро.
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     *
     * @param value кол-во рублей в долларах
     * @return кол-во доллоров
     */

    public static int rubleToDollar(int value) {
        int rsl = value /60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 140;
        expected = 2;
        out = rubleToEuro(in);
        passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

    }
}
