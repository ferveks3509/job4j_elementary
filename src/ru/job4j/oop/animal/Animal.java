package ru.job4j.oop.animal;

public class Animal {
    public Animal(String name) {
        System.out.println("Конструктор родителя Object" + " - " + name);
    }
    public Animal() {
        System.out.println("Animal");
    }
}
