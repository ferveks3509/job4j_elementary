package ru.job4j.io;

import java.util.Scanner;

public class MatchesGame {

    public static void main(String[] args) {
        System.out.println("На стоел 11 спичек. Возьмите от 1 до 3 спичек");
        Scanner input = new Scanner(System.in);
        boolean game = true;
        boolean player = true;
        int value = 11;
        while (game) {
            int select  = Integer.valueOf(input.nextLine());
            if (player) {
                player = false;
                System.out.println("Ход первого игрока");
            } else {
                player = true;
                System.out.println("Ход второго игрока");
            }
            if (select > 0 && select < 4) {
                value -= select;
                if (value <= 0) {
                    System.out.println("Вы выиграли!");
                    game = false;
                } else if (value > 0) {
                    System.out.println("На столе " + value + " спичек.");
                } else if (player == true){
                    System.out.println("Выиграл первый игрок");
                } else {
                    System.out.println("Выиграл второй игрок");
                }
            }
        }
    }
}
