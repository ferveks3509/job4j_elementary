package ru.job4j.Loop;

public class Mortgage {
     public int year(int amount, int salary, double percent) {
        int year = 0;
        double rsl = amount;
        while (rsl > 0) {
            year++;
            rsl = rsl * percent / 100 + rsl - salary;
        }
        return year;
    }
}