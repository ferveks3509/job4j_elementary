package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] one = new int[5];
        for (int index = 0; index < one.length; index++) {
            one[index] = index * 2 + 3;
        }
        for (int index = 0; index <one.length; index++) {
            System.out.println(one[index]);
        }
    }
}
