package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ac, double ab, double bc) {
        if (ab + ac > bc && ac + bc > ab && ab + bc > ac) {
            return true;
        }
        return false;
    }

}
