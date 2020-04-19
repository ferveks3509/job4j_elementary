package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] names = new String[4];
        float[] prices = new float[40];

        names[0] = "Ilya";
        names[1] = "Anna";
        names[2] = "Egor";
        names[3] = "Maria";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
