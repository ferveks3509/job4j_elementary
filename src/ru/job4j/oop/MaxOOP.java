package ru.job4j.oop;

public class MaxOOP {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }
}
    /*public static int max(int first, int second) {
        int itog = first > second ? first : second;
        return itog;
    }
    public static int max1(int two, int three) {
        int itog = two > three ? two : three;
        return itog;
    }
    public static int max2(int four, int five) {
        int itog = four > five ? four : five;
        return itog;
    }
}*/

