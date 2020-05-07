package ru.job4j.oop;

public class Battery {
    private int value;

    public Battery(int size) {
        this.value = size;
    }

    public void exchange(Battery another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery second = new Battery(50);
        first.exchange(second);
        System.out.println("first : " + first.value + " . second : " + second.value);
        second.exchange(first);
        System.out.println("second : " + second.value + " . first : " + first.value);
    }
}
