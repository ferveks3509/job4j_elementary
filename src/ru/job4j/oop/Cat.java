package ru.job4j.oop;

public class Cat {

    private String food;

    public void show() {
        System.out.println(this.name + " - " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    private String name;
    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("GAV");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("BLACK");
        black.show();
    }
}