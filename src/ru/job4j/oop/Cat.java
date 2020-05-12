package ru.job4j.oop;

public class Cat {
    private String food; //создаем поле объекта

    public void eat(String meat) { //инициализируем поле объекта
        this.food = meat;
    }
    public void show() { //метод для вывода поля в консоль
        System.out.println(this.food);
    }
    public static void main(String[] args) {
        System.out.println("There are food for Peppy:");
        Cat peppy = new Cat();
        peppy.eat("kotleta"); // если не указать то умолчанию, во всех полях объекта записываются значения по умолчанию String - Null
        peppy.show();  // вызов метода указанием объекта . обращение к методу
        System.out.println("There are food for Sparky:");
        Cat sparky = new Cat();
        sparky.eat("fish"); // если не указать то умолчанию, во всех полях объекта записываются значения по умолчанию String - Null
        sparky.show();
    }
}
