package ru.job4j.Loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int index = 2; index <= n; index++) {
            result = result * index;
        }
        return result;
    }
}
