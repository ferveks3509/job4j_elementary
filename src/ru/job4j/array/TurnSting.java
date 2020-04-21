package ru.job4j.array;

public class TurnSting {
    public static void main(String[] args) {
        String[] array = new String[] { "Каждый", "охотник", "хочет", "знать", "где", "фазан"};
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int a = array.length;
        for(int i = 0; i < a / 2; i++) {
            String temp = array[a - i - 1];
            array[a - i - 1] = array[i];
            array[i] = temp;
        }
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
