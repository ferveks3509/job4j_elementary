package ru.job4j.oop;

public class Cat {
    private String food; //создаем поле объекта
    private String name;

    public void eat(String meat) { //инициализируем поле объекта
        this.food = meat;
    }
    public void show() { //метод для вывода поля в консоль
        System.out.println(this.food + " - " + this.name);
    }
    public void giveNick(String nick) {
        this.name = nick;
    }
    public static void main(String[] args) {
        System.out.println("There are food for Peppy:");
        Cat peppy = new Cat();
        peppy.giveNick("for belka");
        peppy.eat("kotleta "); // если не указать то умолчанию, во всех полях объекта записываются значения по умолчанию String - Null
        peppy.show();  // вызов метода указанием объекта . обращение к методу
        System.out.println("There are food for Sparky:");
        Cat sparky = new Cat();
        sparky.giveNick("for strelka");
        sparky.eat("fish"); // если не указать то умолчанию, во всех полях объекта записываются значения по умолчанию String - Null
        sparky.show();
    }
}
