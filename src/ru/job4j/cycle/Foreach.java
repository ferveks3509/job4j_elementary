package ru.job4j.cycle;

public class Foreach {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
