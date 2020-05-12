package ru.job4j.oop;


public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }
    public void exchange(Battery another) { // теперь мы пользуемся уже ссылочными типами данных. Можно использовать объекты классов
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(100);
        Battery battery2 = new Battery(50);
        battery.exchange(battery2);
        System.out.println(battery.load + " - " + battery2.load);
    }
}
