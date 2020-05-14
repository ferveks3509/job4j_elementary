package ru.job4j.oop.encapsulation;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Shurakov Ilya");
        student.setGroup("programmer");
        student.setDateIncome("1.01.2020");
        //student.setCreated(14.05.2020);

        System.out.println(student.getFio() + " FIO student." + System.lineSeparator()
                + student.getGroup() + " profession" + System.lineSeparator()
                + student.getDateIncome() + " data income in college"
                /*+ student.getCreated()*/);
    }
}
