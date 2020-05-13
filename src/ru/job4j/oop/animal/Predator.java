package ru.job4j.oop.animal;

public class Predator extends Animal {
    public Predator(String name) {
        super(name);
        System.out.println("Вызов коструктора Animal" + " - " + name);
    }
    public Predator() {
        System.out.println("Predator");
    }
}
