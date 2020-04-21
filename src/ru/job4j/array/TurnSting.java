package ru.job4j.array;

public class TurnSting {
    public static void main(String[] args) {
        String[] q = new String[] { "Каждый", "охотник", "хочет", "знать", "где", "фазан"};
        for(int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
        }
        int a = q.length;
        for(int i = 0; i < a / 2; i++) {
            String temp = q[a - i - 1];
            q[a - i - 1] = q[i];
            q[i] = temp;
        }
        System.out.println();
        for(int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
        }

    }
}
