package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        int speed = 50;
    }

    @Override
    public void people(int value) {
        int peopleInBus = 10 + value;
    }

    @Override
    public double buyFuel(double fuel) {
        double price;
        price = fuel * 10;
        return price;
    }
}
