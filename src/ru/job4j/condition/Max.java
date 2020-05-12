package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
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
}