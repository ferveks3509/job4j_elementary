package ru.job4j.oop;

public class Cat {
    private String food;

    public void eat(String meat) {
        this.food = meat;
    }
    public void show() {
        System.out.println(this.food);
    }
    public static void main(String[] args) {
        System.out.println("There are food for Peppy:");
        Cat peppy = new Cat();
        peppy.eat("kotleta"); // если не указать то умолчанию, во всех полях объекта записываются значения по умолчанию String - Null
        peppy.show();
        System.out.println("There are food for Sparky:");
        Cat sparky = new Cat();
        sparky.eat("fish"); // если не указать то умолчанию, во всех полях объекта записываются значения по умолчанию String - Null
        sparky.show();
    }
}
