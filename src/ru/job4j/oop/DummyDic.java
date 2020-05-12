package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String word = "hello - " + eng;
        return word; //Теперь вызов метод можно представить как переменную типа String
    }
    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String say = dic.engToRus("Привет: "); //мы можем использовать метот как переменную
        System.out.println(say + "перевод.");
    }
}
