package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        poosibleDiv(4);
        poosibleDiv(0);
    }

    public static void poosibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0");
        }
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}
