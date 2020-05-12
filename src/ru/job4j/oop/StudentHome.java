package ru.job4j.oop;

public class StudentHome {
    private int id;
    private String name;
    private int ears;
    private String birthDay;

    public StudentHome(int id, String name, int ears, String birthDay) {
        this.id = id;
        this.name = name;
        this.ears = ears;
        this.birthDay = birthDay;
    }
    public int foundEducation(int i) {
        if (i == ears) {
            System.out.println("doctor");
        } else if (i > ears) {
            System.out.println("teacher");
        } else {
            System.out.println("programmer");
        }
        return i;
    }
    public void show() {
        System.out.println(this.ears + " - " + foundEducation(20));
    }
    public static void main(String[] args) {
        StudentHome student1 = new StudentHome(1, "ilya", 27, "27 jun, 1993");
        StudentHome student2 = new StudentHome(2, "Olga", 19, "2 jun, 2001");
        StudentHome student3 = new StudentHome(3, "Nataliya", 27, "14 march, 1993");
        student1.show();
        student2.show();
        student3.show();
    }
}
