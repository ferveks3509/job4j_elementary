package ru.job4j.io;

import java.util.Scanner;

public class MatchesGame {

    public static void main(String[] args) {
        System.out.println("На стоел 11 спичек. Возьмите от 1 до 3 спичек");
        Scanner input = new Scanner(System.in);
        boolean game = true;
        int value = 11;
        while (game) {
            int select  = Integer.valueOf(input.nextLine());
            if (select > 0 && select < 4) {
                value -= select;
                System.out.println(value);
                if (value <= 0) {
                    System.out.println("Вы выиграли!");
                    game = false;
                } else if (value > 0) {
                    System.out.println("На столе " + value + " спичек." + " Ходит следующий игрок");
                }
            }
        }
    }
}
