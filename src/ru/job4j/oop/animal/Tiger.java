package ru.job4j.oop.animal;

public class Tiger extends Predator {
    public Tiger(String name) {
        super(name);
        System.out.println("Вызов коструктора Predator" + " - " + name);
    }

    public Tiger() {
        System.out.println("Tiger");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Инициализация параметра name");
    }
}
