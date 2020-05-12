package ru.job4j.oop;

public class Student {

    public void music(String say) {
        System.out.println("la-la-la : " + say);
    }
    public void song(String say) {
        System.out.println("i believe i can fly : " + say);
    }
    public static void main(String[] args) {
        Student petya = new Student();
        String singSong = "my song";
        petya.music(singSong); //можем использовать входящий параметр метода.
        petya.song("love this song"); //можем записать параметр в вызове метода.
    }
}
