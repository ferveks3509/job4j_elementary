package ru.job4j.Loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        boolean rsl = true;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number) == rsl) {
                count++;
            }
        }
        return count;
    }
}

